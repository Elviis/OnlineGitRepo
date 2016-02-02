package ca.sheridancollege;

public class CounterTest {

	public static void main(String[] args) {
		int size = 4;

		Thread[] t = new Thread[size];
		for (int i = 0; i < size; i++) {
			t[i] = new Thread(new Counter("t" + i));
		}

		System.out.println("Starting the threads...");
		for (int i = 0; i < size; i++) {
			t[i].start();
		}

	}

}
