package com.streams.games;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {
		
		Function<String, List<String>> reference = (str)->{
			List<String> listStrings = new ArrayList<String>();
			
			String[] string = str.split("");
			for(String value : string) {
				listStrings.add(value);
			}
			return listStrings;
		};
		System.out.println(reference.apply("java is fun"));
	}
}
