package ca.sheridancollege;

public class MyProducer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i =0; i < 10; i++){
			
			myHolder.setAndPrintVar(i, threadNum);
		}
		
	}
private MyHolder myHolder;
	
	int threadNum;

	public MyProducer(MyHolder myHolder, int threadNum) {
		this.myHolder = myHolder;
		this.threadNum = threadNum;
	}
	
	

}
