import java.util.*;
public class minimumoperationtoreducextozero {
	static long min(long a,long b){
		return a<b?a:b;
	}
	static long solution(long a[],int start,int end,long length){
		if(length==0) return 0;
		if(length<0 || start>end )
		return Integer.MAX_VALUE;
		return min(1+solution(a,start+1,end,length-a[start]),1+solution(a,start,end-1,length-a[end]));
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		int i;
		for(i=0; i<n; i++)
		a[i]=sc.nextInt();
		int length=sc.nextInt();
		long val=solution(a,0,n-1,length);
		System.out.println(val>=Integer.MAX_VALUE?-1:val);
	}
}
