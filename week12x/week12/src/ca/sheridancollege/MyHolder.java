package ca.sheridancollege;

public class MyHolder {

	
	int x = 999;
	
	public void setAndPrintVar(int value, int threadNum){
		
		x = value;
		
		
		try {
			Thread.sleep((int)Math.random() * 500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("p" + threadNum + " set " + value +
				" but the value is actually " + x);
		
		
	}
}
