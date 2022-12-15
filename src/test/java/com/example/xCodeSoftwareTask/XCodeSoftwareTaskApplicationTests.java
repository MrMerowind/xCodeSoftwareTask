package com.example.xCodeSoftwareTask;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XCodeSoftwareTaskApplicationTests {

	private Endpoint1 controller = new Endpoint1();
	private Numbers numbers = new Numbers();

	@Test
	public void contextLoads() throws Exception {
		
		assertNotNull(controller);
		assertNotNull(numbers);
	}

	@Test
	public void sorting() throws Exception {
		int[] array1 = {1,2,3,4,5,6,3};

		int[] response1 = {6, 5 , 4, 3, 3, 2, 1};
		int[] response2 = {1, 2 , 3, 3, 4, 5, 6};

		numbers.setNumbers(array1);
		numbers.setOrder("DESC");
		numbers.quickSortInit();
		assertArrayEquals(numbers.getNumbers(), response1);

		numbers.setOrder("ASC");
		numbers.quickSortInit();
		assertArrayEquals(numbers.getNumbers(), response2);
	}

}
