package cn.edu.fudan.selab.edge.DAO;

import cn.edu.fudan.selab.edge.Domain.AbilityDesc;
import cn.edu.fudan.selab.edge.Domain.Entity;
import org.apache.ibatis.annotations.Param;

public interface EdgeDAO {

    Entity queryEntityByAbilityDesc(@Param("abilityDesc")String abilityDesc);


}
