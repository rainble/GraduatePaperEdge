package cn.edu.fudan.selab.edge.DAO;

import cn.edu.fudan.selab.edge.Domain.Entity;
import org.apache.ibatis.annotations.Param;

public interface EntityDAO {

    public Entity queryEntityById(@Param("entityId")int entityId);

    public boolean updateCallTime(@Param("entityId")int entityId);
}
