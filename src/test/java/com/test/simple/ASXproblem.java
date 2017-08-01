package com.test.simple;

import java.util.HashMap;

public class ASXproblem {
	
	public ASXproblem(){
		super();
	}
	 static String result;
	public  void ASX(String expected,String Actual) {
		//String expected = "|a=john|b=25|c=1.5|d=24|e=example|f=others|";
	//	String Actual = "|b=25|c=1.5|d=24|e=example|a=john|f=others|";
		 HashMap<String,String> hm=new HashMap<String,String>();
		 HashMap<String,String> hm1=new HashMap<String,String>();
		 String[] KV1,KV2;
		String[] expectedlist = expected.split("\\|");
		String[] Actuallist = Actual.split("\\|");
	   
	for (String string1 : expectedlist) {
		// System.out.println(string1);
        KV1 = string1.split("=");
       for(int i=1;i<KV1.length;i++){
       // System.out.println(KV1[0]+">>>"+KV1[i]);
       hm.put(KV1[0], KV1[i]);
      }
          
	}
	
	for (String string1 : Actuallist) {
		
	      //  System.out.println(string1);
	        KV2 = string1.split("=");
	       for(int i=1;i<KV2.length;i++){
	       // System.out.println(KV1[0]+">>>"+KV1[i]);
	       hm1.put(KV2[0], KV2[i]);
	      }}
	
	 if (expected.length()<Actual.length()&&hm1.entrySet().containsAll(hm.entrySet())) {
        
		 result ="matching";
		 System.out.println("matching");
   }
   
	 else if (expected.length()>Actual.length()&&hm.entrySet().containsAll(hm1.entrySet())){
		 result ="matching";
		 System.out.println("matching");
	 }
 else if (expected.length()==Actual.length()&&hm.entrySet().containsAll(hm1.entrySet())){
	 result ="matching";
		 System.out.println("matching");
	 }
	 
	 else {  
		 result ="not matching";
	   System.out.println("not matching");
   }
}
public void getResult(){
   this.result = result;
   System.out.println(result);
}
	}
