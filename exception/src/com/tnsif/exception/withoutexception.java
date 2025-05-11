package com.tnsif.exception;

public class withoutexception {

	public static void main(String[] args) throws
	ArrayIndexOutOfBoundsException {

//			int a=10;
//			int b=0;
//			int result=a/b;
//			System.out.println("The result is"+result);
			try {
			int a=10;
			int b=0;
			int result=a/b;
			int arr[]= {1,2,3,4};
			arr[5]=6;
			System.out.println("The result is"+result);
			System.out.println("The result is"+arr[5]);
			}
			catch(ArithmeticException e) {
				System.out.println("A number cannot be divided by zero");
			}
			
			catch(Exception e) {
				System.out.println("Given array size is not existing");
			}
		}
	}


