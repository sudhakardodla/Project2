import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='G') {
				if(str.charAt(i)=='A')
					sum+=1;
				else if(str.charAt(i)=='B')
					sum+=10;
				else if(str.charAt(i)=='C')
					sum+=100;
				else if(str.charAt(i)=='D')
					sum+=1000;
				else if(str.charAt(i)=='E')
					sum+=10000;
				else if(str.charAt(i)=='F')
					sum+=100000;
				else if(str.charAt(i)=='G')
					sum+=1000000;
			}
		}
		System.out.println(sum);
	}

}
