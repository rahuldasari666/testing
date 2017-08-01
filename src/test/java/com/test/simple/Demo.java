package com.test.simple;

public class Demo {

	public static void main(String[] args) {
Hello mysuper = new Hello();
Subhello mysubclass = new Subhello();

mysuper.getMessage();
mysubclass.getMessage();

mysuper.setMessage("good one");
mysubclass.setMessage("good tw2o");

mysuper.getMessage();
mysubclass.getMessage();

	
	}

}
