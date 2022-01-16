package com.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	
	BlockingQueue<Integer> questionQueue;
	public Consumer(BlockingQueue<Integer>questionQueue) {
		this.questionQueue=questionQueue;
	}

	@Override
	public void run() {
		while(true) {
		try {
			System.out.println("Answered Question: "+questionQueue.take());
		} catch (InterruptedException e) {
			
		}
		}
	}
}
