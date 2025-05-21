package com.tnsif.Threadrun;

public class ThreadSynchronizationMain {
	public static void main(String[] args) {
		Thread t1=new Thread(){
	       	public void run() {
	       		try {
						ThreadSyncronization.add(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	       	}
	       };
			
			
	       Thread t2=new Thread(){
	       	public void run() {
	       		try {
						ThreadSyncronization.add(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	       	}
	       };
			
			t1.start();
			t2.start();
				}
}
