import java.util.*;
public class uncorssedlines {
	public static int max(int a,int b){
		return a>b?a:b;
	}
	public static void main(String arg[]){ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		int m=sc.nextInt();
		int b[]=new int[n];
		for(i=0;i<n;i++)
		b[i]=sc.nextInt();
		int dp[][]=new int[n+1][m+1];
		int j;
		for(i=0;i<=n;i++)
		dp[i][0]=0;
		for(i=0;i<=m;i++)
		dp[0][i]=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++){
				if(a[i-1]==b[j-1]){
					dp[i][j]=1+dp[i-1][j-1];
				}
				else
				dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
			}
		}
		System.out.println(dp[n][m]);
	}
}
