package com.tnsif.Threadrun;

	public class Thread2 extends Thread{
		
		Threadcomm tc;
		public Thread2(Threadcomm tc) {
			super();
			this.tc = tc;
		}
		
		public void run() {
			for(int k=0;k<=5;k++) {
				tc.receive();
			}
		}
	}

