package java_test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int lucky = rand.nextInt(10);
		System.out.println("乱数 : "+lucky);
		String a = new String("あいうえお");
		System.out.println(a);
	}

}