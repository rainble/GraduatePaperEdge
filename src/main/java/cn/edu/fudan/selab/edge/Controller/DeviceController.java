package cn.edu.fudan.selab.edge.Controller;

import cn.edu.fudan.selab.edge.Domain.Device;
import cn.edu.fudan.selab.edge.Utils.CallResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/device")
public class DeviceController {

    @RequestMapping(value = "/call", method = RequestMethod.POST)
    @ResponseBody
    public CallResult callDevice(HttpServletRequest request, HttpServletResponse response) {
        String
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Device> listDevice(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/listbyability", method = RequestMethod.POST)
    @ResponseBody
    public List<Device> listDeviceByAbility(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public Device queryDeviceById(HttpServletRequest request, HttpServletResponse response) {

    }

    private <V> CallResult sendHttpToDevice(String url, Map<String, V> param) {

    }

}
