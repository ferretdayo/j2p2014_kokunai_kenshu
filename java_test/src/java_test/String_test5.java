package java_test;

public class String_test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "school";
		if(s.equals("School")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		s = s.replace("o","a");
		System.out.println(s);
	}

}