package ca.sheridancollege;

public class Runit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 100;
MyHolder h = new MyHolder();

Thread p1[] = new Thread[size];

//Thread p2[] = new Thread[size];


 for (int i =0; i < size; i++){
	p1[i] = new Thread(new MyProducer(h, i)); 
	//p2[i] = new Thread(new MyProducer(h, i));
	
 }
 
 for (int i = 0; i < size; i++){
p1[i].start();

//p2[i].start();
 }
		
	}

}
