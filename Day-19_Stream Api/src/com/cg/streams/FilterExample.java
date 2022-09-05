package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String>obj =Arrays.asList(new String[] {"shiva","nia","lekha","vikas"});
		//to return the String whose length is greater than 3
		obj.stream().filter((i->i.length()>3)).forEach((i)->System.out.println(i+" "));

	}

}