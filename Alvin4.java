package student;

public class Alvin4 {
	public static void main(String[] args) {
		
		java.util.Scanner scan=new java.util.Scanner(System.in);
		
		System.out.print("請輸入數字求因數");
		
		int ant=scan.nextInt();
		for(int i=1;i<=100;i++) {
			if((ant%i)==0) {
				System.out.print(i+",");
			}
		}

	}
}