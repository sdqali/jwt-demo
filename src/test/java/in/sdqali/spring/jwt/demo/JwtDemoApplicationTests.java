package in.sdqali.spring.jwt.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JwtDemoApplication.class)
@WebAppConfiguration
public class JwtDemoApplicationTests {

	@Test
	public void contextLoads() {
		for(int i = 0; i < 10; i++) {
			System.out.println(UUID.randomUUID());
		}
	}

}
