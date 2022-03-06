import java.util.*;
public class countnoofwayscoinexchange {

	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)a[i]=sc.nextInt();
		int sum=sc.nextInt();
		long dp[][]=new long[n+1][sum+1];
		int j;
		for(i=0;i<=n;i++)dp[i][0]=1;
		for(i=1;i<=sum;i++)dp[0][i]=0;
		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++){
				if(a[i-1]>j)
				dp[i][j]=dp[i-1][j];
				else
				dp[i][j]=dp[i-1][j]+dp[i][j-a[i-1]];
			}
		}
		System.out.println(dp[n][sum]);
	}
}
