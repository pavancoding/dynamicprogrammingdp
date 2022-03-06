import java.util.*;
public class maxdivisible {
	static int maxval=Integer.MIN_VALUE;
	static int maxcount=Integer.MAX_VALUE;
	static int max(int a,int b){
		
		return Math.max(a,b);
		
	}
	static int solution(int a[],int sum,int count,int n){
		
		if(sum>maxval && sum%3==0 && maxcount>count){
			System.out.println(sum+""+count);
			maxval=sum;
			maxcount=count;
		}
		int val;
		if(n==-1)
		return 0;
		else
		val= max(solution(a,sum,count,n-1),solution(a,sum-a[n],count+1,n-1)+a[n]);
		return val;
	}
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		int sum=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println(solution(a,sum,0,n-1));
	}
}
