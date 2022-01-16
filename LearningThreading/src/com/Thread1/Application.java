package com.Thread1;

public class Application {
	
	public static void main(String args[]) {
		Sequence sequence=new Sequence();
		Worker work1=new Worker(sequence);
		work1.start();
		
		
		Worker work2=new Worker(sequence);
		work2.start();
		
	}

}
    class Worker extends Thread {
    	Sequence sequence=null;
        
    	public Worker(Sequence sequence) {
    		this.sequence=sequence;
    	}
    
    
    public void run() {
    	for(int i=0; i<100; i++) {
    		System.out.println(Thread.currentThread().getName()+"got value "+sequence.getNext());
    	  try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
    }
    
    } 
    
    
    