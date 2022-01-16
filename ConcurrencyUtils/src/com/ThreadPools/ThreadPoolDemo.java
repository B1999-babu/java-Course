package com.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String args[]) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
	    Runnable processor=new MessageProcessor(2);
	    executor.execute(processor);
	    
	    Runnable processor1=new MessageProcessor(2);
	    executor.execute(processor1);
	    
	    Runnable processor2=new MessageProcessor(3);
	    executor.execute(processor2);
	    
	    Runnable processor3=new MessageProcessor(4);
	    executor.execute(processor3);
	    
	    Runnable processor4=new MessageProcessor(4);
	    executor.execute(processor4);
	    
	    executor.shutdown();
	    while(!executor.isTerminated()) {
	    	
	    }
	    System.out.println("Submitted all the tasks...");
	    
	}
}
