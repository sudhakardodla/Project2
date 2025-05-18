import java.util.Scanner;
public class Question4 {
	static int fun(int arr1[],int arr2[],int k) {
		int count1=0;
		for(int ele:arr1) {
			if(ele>k)
				count1+=1;
		}
		int count2=0;
		for(int ele:arr2) {
			if(ele<k)
				count2+=1;
		}
		return Math.max(count1, count2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		sc.close();
		System.out.println(fun(arr1,arr2,k));
	}
}