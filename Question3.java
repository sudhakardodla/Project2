import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		int count=0;
		for(int ele: arr) {
			if(Math.abs(k-ele)<=m)
				count+=1;
		}
		System.out.println(count);
	}
}