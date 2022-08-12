package com.streams.games;

import java.util.Arrays;
import java.util.Optional;

public class FruitsDemo {

	public static void main(String[] args) {
      
		Optional<String> berryFruits=Arrays.asList("blueBerry","mango","jam","blackBerry","banana")
				.stream()
				.filter((str)->str.contains("Berry"))
				.sorted()
				.findFirst();
		if (berryFruits.isPresent())
		{
			String fruit= berryFruits.get();
			System.out.println(fruit);
		}
	}

}
