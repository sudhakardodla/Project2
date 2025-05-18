import java.util.Scanner;

public class Question5 {
	private static int fun(int[] arr,int k) {
		int diff=k-arr[0];
		int num=arr[0];
		for(int ele:arr) {
			if(Math.abs(ele-k)<diff) {
				diff=Math.abs(ele-k);
				num=ele;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(fun(arr,k));
	}
	//Question5 Code is modified
}
