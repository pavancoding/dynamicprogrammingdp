import java.util.*;
public class coinexchangebruteforce {
	static int min(int a,int b){
		return a>b?b:a;
	}
	static int recursive(int a[],int start,int target,int end){
		if(target==0 && start==end)
		return Integer.MIN_VALUE;
		if(target<0 || start>=end)
		return Integer.MIN_VALUE;
		if(target==0)
		return 0;
		return min(1+recursive(a,start,target-a[start],end),recursive(a,start+1,target,end));

	}
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		int target=sc.nextInt();
		System.out.println(recursive(a,0,target,n));
	}
}
