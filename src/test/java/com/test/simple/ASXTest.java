package com.test.simple;

public class ASXTest extends ASXproblem{
	
	public  void Test() {
		String expected = "|a=john|b=25|c=1.5|d=24|e=example|f=others|";
		String Actual = "|b=25|c=1.5|d=24|e=example|a=john|f=others|";
		ASXproblem ASX = new ASXproblem();
		ASX.ASX(expected, Actual);
		System.out.println(result);
				
	}
	
	public void getResult(){
		System.out.println("method overridden");
	}
	
}
