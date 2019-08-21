package cn.edu.fudan.selab.edge.Controller;

import cn.edu.fudan.selab.edge.Domain.Entity;
import cn.edu.fudan.selab.edge.Service.EntityService;
import cn.edu.fudan.selab.edge.Utils.CallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    EntityService entityService;

    @RequestMapping(value = "/call", method = RequestMethod.POST)
    @ResponseBody
    public CallResult callDeviceById(HttpServletRequest request, HttpServletResponse response) {
        int entityId = Integer.valueOf(request.getParameter("entityId"));
        boolean res = entityService.callEntityById(entityId);
        CallResult callResult;
        if (res) {
            callResult = new CallResult();
        } else {
            callResult = new CallResult(String.format("call device failed at [ %s ]", new Date()));
        }
        return callResult;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public void listDevice(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/listbyability", method = RequestMethod.POST)
    @ResponseBody
    public void listDeviceByAbility(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public Entity queryDeviceById(HttpServletRequest request, HttpServletResponse response) {
        int entityId = Integer.valueOf(request.getParameter("entityId"));
        Entity entity = entityService.queryEntityById(entityId);
        return entity;
    }

}
