import com.zwq.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/2 10:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void getAll() {
		System.out.println(userService.getAll());
		System.out.println(userService.getAll());
	}
}