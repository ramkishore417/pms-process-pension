package com.ramkishore.processpension.model;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ProcessPensionResponseTest {

	@Test
	public void beanCreationTest() {
		assertNotNull(new ProcessPensionResponse());
	}

	@Test
	public void noArgsConstructorTest() {
		ProcessPensionResponse processPensionResponse = new ProcessPensionResponse();
		assertThat(assertThat(processPensionResponse).isNotNull());
	}

}
