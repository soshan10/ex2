package com.soshan.ex2;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class MainControllerTests {

	// If the integer is a multiple of 7, it should return "C", 
	@Test
	void CheckIndexFor7() {
		MainController controller = new MainController();
		Map<String,String> response = controller.index(7);
		Assert.isTrue(response.containsValue("C"), "Should return C");
	}

	//If the integer is a multiple of 9, it should return "N", 
	@Test
	void CheckIndexFor9() {
		MainController controller = new MainController();
		Map<String,String> response = controller.index(9);
		Assert.isTrue(response.containsValue("N"), "Should return N");
	}

	//If the integer is a multiple of both 7 and 9, then both "CN" should be displayed. 
	void CheckIndexFor7_9() {
		MainController controller = new MainController();
		Map<String,String> response = controller.index(63);
		Assert.isTrue(response.containsValue("CN"), "Should return CN");
	}

	//For other values, the provided integer should be returned 
	void CheckIndexForOthers() {
		MainController controller = new MainController();
		Map<String,String> response = controller.index(1);
		Assert.isTrue(response.containsValue("1"), "Should return 1");
	}

}
