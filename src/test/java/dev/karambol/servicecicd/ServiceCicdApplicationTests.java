package dev.karambol.servicecicd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@Disabled
class ServiceCicdApplicationTests {

	@Test
	void contextLoads() {
	}

}
