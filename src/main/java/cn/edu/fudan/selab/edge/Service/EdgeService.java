package cn.edu.fudan.selab.edge.Service;

import cn.edu.fudan.selab.edge.DAO.EdgeDAO;
import cn.edu.fudan.selab.edge.Domain.AbilityDesc;
import cn.edu.fudan.selab.edge.Domain.Entity;
import cn.edu.fudan.selab.edge.Utils.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdgeService {

    @Autowired
    EdgeDAO edgeDAO;

    //如果有多个设备拥有相同能力就选择lastCallTime离现在最近的那个
    //把ip地址当作参数传进去，实际需要的参数在软件服务中定好。
    public String queryAndCallDeviceByAbility(AbilityDesc abilityDesc) {
        Entity entity = edgeDAO.queryEntityByAbilityDesc(abilityDesc.getVerb() + " " + abilityDesc.getObject());

    }

    public String queryAndCallCyberServiceByDesc(String desc) {

    }

}
