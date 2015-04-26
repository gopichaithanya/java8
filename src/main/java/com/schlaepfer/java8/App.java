package com.schlaepfer.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    
	private static List<String> myList = Arrays.asList("element1","element2","element3");
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public void doList() {
		myList.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
	}

	public void doLambda() {
		myList.forEach((String element) -> System.out.println(element));
	}
}
