package cn.edu.fudan.selab.edge.Service;

import cn.edu.fudan.selab.edge.DAO.EntityDAO;
import cn.edu.fudan.selab.edge.Domain.Entity;
import cn.edu.fudan.selab.edge.Utils.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    @Autowired
    EntityDAO entityDao;

    public boolean callEntityById(int entityId) {
        Entity entity = entityDao.queryEntityById(entityId);
        String res = HttpRequest.sendGet(entity.getCallUrl());
        entityDao.updateCallTime(entityId);
        return res == "success" ? true : false;
    }

    public Entity queryEntityById(int entityId) {
        Entity entity = entityDao.queryEntityById(entityId);
        return entity;
    }


}
