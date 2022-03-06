import java.util.*;
public class minsubset {
	public static void main(String arg[]){ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		boolean dp[][]=new boolean[n+1][sum+1];
		int j;
		for(i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		for(i=1;i<=sum;i++) {
			dp[0][i]=false;
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++) {
				if(a[i-1]>j){
				dp[i][j]=dp[i-1][j];}
				else
				dp[i][j]=(dp[i-1][j]||dp[i-1][j-a[i-1]]);
			}
		}
		int min=Integer.MAX_VALUE;
		for(i=(sum/2);i>=0;i--)
		if(dp[n][i]==true) 
		min=min<(sum-2*i)?min:(sum-2*i);
		System.out.println(min);
		
	}
}
