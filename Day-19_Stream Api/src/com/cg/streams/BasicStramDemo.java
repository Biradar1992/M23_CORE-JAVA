package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStramDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Yogesh","ROhit","Aman","kalpesh");
		//terminal 
		obj.forEach((i)->System.out.println(i));
		
		
		List<String>obj1=Arrays.asList(new String[] {"56","99","89","67"});
        obj=obj1.stream();
        obj.forEach(System.out::println);
	}

}