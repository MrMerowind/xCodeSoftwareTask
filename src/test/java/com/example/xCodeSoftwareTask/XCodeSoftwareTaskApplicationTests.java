package com.example.xCodeSoftwareTask;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class XCodeSoftwareTaskApplicationTests {

	private Endpoint1 controller = new Endpoint1();

	@Test
	public void contextLoads() throws Exception {
		
		Assert.notNull(controller, "Endpoint1 controller must be defined.");
	}

}
