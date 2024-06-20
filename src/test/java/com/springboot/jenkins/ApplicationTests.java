package com.springboot.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

	public static Logger log = LoggerFactory.getLogger(Application.class);

	@Test
	void contextLoads() {
		log.info("executing test case");
		assertEquals(true,true);
	}

}
