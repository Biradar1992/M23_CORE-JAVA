package com.cg.streams;


import java.util.Arrays;
import java.util.List;

public class FileringDemo {

	public static void main(String[] args) {
		List<Integer>obj =Arrays.asList(11,22,33,44);
        obj.stream().filter(i->i>25).forEach((i)->System.out.print(i+" "));
        System.out.println("the distinct elements are: ");
        obj.stream().distinct().forEach((i)->System.out.print(i+" "));
	}

}