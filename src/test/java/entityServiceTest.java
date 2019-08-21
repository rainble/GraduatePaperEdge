import cn.edu.fudan.selab.edge.Domain.Entity;
import cn.edu.fudan.selab.edge.Service.EntityService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class entityServiceTest extends BaseTest {

    @Autowired
    EntityService entityService;

    @Test
    public void callEntityByIdTest() {
        boolean res = entityService.callEntityById(1);
        System.out.println(res);
    }

    @Test
    public void queryEntityByIdTest() {
        Entity entity = entityService.queryEntityById(1);
        System.out.println(entity.toString());
    }
}
