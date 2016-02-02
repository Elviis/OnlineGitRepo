package ca.sheridancollege;

public class Counter1 implements Runnable {

	
	// class variable
	
private String name;

	@Override
	public void run(){
		
		for (int i =0; i < 10; i++){
			System.out.println(name + " is at "+ i);
			try {
				
				Thread.sleep((int)Math.random() * 2000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
				
	}

	public Counter1(String name) {
		
		this.name = name;
		
	}
	
	
	
}
