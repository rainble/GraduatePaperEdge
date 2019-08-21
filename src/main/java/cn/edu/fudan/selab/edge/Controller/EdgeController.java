package cn.edu.fudan.selab.edge.Controller;

import cn.edu.fudan.selab.edge.Domain.AbilityDesc;
import cn.edu.fudan.selab.edge.Domain.Entity;
import cn.edu.fudan.selab.edge.Service.EdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/edge")
public class EdgeController {

    @Autowired
    EdgeService edgeService;

    @RequestMapping(value = "/queryAndCallDeviceByAbility", method = RequestMethod.GET)
    @ResponseBody
    public String queryAndCallDeviceByAbility(AbilityDesc abilityDesc) {
        String result = edgeService.queryAndCallDeviceByAbility(abilityDesc);
        return result;
    }

}
