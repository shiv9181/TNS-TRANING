package com.tnsif.Threadrun;

public class Thread1 extends Thread{
	
	Threadcomm tc;
	public Thread1(Threadcomm tc) {
		super();
		this.tc = tc;
	}
	
	public void run() {
		for(int j=1;j<5;j++) {
			tc.deliver();
		}
	}
}
