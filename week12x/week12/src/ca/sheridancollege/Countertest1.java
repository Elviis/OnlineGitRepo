package ca.sheridancollege;

public class Countertest1 {

	public static void main(String[] args) {
		int size = 4;
		
		//thread of arrays
		Thread[] t = new Thread[size];
		
		for (int i =0; i < size; i++){
			
			t[i] = new Thread(new Counter1("t" + i));
			
			}
		
		System.out.println("starting the Threads");
		
		for(int i =0; i < size; i++){
			t[i].start();
			
		}
		
	}

}
