package com.cr7.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author GameS
 *
 */
public class StreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> weight = new ArrayList<>();
		weight.add(20);
		weight.add(9);
		weight.add(870);
		weight.add(760);
		weight.add(30);
		weight.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
	}

}
