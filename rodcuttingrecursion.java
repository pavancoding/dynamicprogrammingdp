import java.util.*;
public class rodcuttingrecursion {
	static int max(int a,int b){
		return a>b?a:b;
	}
	static int solution(int length[],int price[],int n){
		int i;
		int maxval=0;
		if(n<=0)
		return 0;
		for(i=0;i<n;i++)
		 maxval=max(maxval,price[i]+solution(length,price,n-i-1));
		return maxval;
	}
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int length[]=new int[n];
		int price[]=new int[n];
		for(i=0;i<n;i++)length[i]=sc.nextInt();
		for(i=0;i<n;i++)price[i]=sc.nextInt();
		int size=sc.nextInt();
		System.out.println(solution(length,price,n));
	}
}
