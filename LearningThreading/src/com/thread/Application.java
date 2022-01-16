package com.thread;

public class Application {

	public static void main(String args[]) {
		
		
		System.out.println("Starting threading 1");
       
       Thread t1=new Thread(new Task("Thread-A"));
			t1.start();
			
			
	  System.out.println("Starting threading 2");
       
       Thread t2=new Thread(new Task("Thread-B"));
	    	t2.start();
			
			
	}
	
  }


    class Task extends Thread {
    	String name;
    	public Task(String name) {
    		this.name=name;
    	}
    	
    	public void run() {
    		Thread.currentThread().setName(this.name);
    		
    		for(int i=0; i<1000; i++) {
    			System.out.println("number: "+i+" - "+Thread.currentThread().getName());
    			try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    }	

