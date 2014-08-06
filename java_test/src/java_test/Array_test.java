package java_test;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 10;
		int [] a = new int[len];
		int [] b = new int[len];
		int j = 1;
		for(int i = 0;i < a.length;i++,j++){
			a[i] = j;
		}
		int sum = 0;
		for(int i = 0;i < a.length;i++){
			sum += a[i];
		}
		for(int i = 0;i < a.length;i++){
			b[i] = a[i];
		}
		System.out.println(sum);
	}
}
