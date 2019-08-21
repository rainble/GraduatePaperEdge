import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Spring/spring-DAO.xml", "classpath:Spring/spring-service.xml", "classpath:Spring/spring-controller.xml"})
public class BaseTest  {
}
