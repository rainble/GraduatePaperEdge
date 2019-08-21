import cn.edu.fudan.selab.edge.DAO.EdgeDAO;
import cn.edu.fudan.selab.edge.Domain.Entity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EdgeServiceTest extends BaseTest {

    @Autowired
    EdgeDAO edgeDAO;

    @Test
    public void queryAndCallDeviceByAbilityTest() {
        Entity result = edgeDAO.queryEntityByAbilityDesc("provide water");
        System.out.println(result.toString());
    }


}
