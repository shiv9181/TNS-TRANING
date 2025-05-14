package com.tnsif.variablesdemo;

public class DemoVarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance of the class
				DemoTypesVar ob=new DemoTypesVar();
				//instance var call
				int result=ob.numone=10;
				System.out.println("this is instance variable output" +result);
				//local variable
				ob.display();
				
				//static variable
				System.out.println("this is static variable output" +DemoTypesVar.numthree );
		        
	}

}
