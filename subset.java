import java.util.*;
class subset{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		int j;
		boolean dp[][]=new boolean[n+1][sum+1];
		for(i=0;i<=n;i++)
		dp[i][0]=true;
		for(i=1;i<=sum;i++)
		dp[0][i]=false;
		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++){
				if(j<a[i-1])
			    dp[i][j]=dp[i-1][j];
				else
				dp[i][j]=(dp[i-1][j]||dp[i-1][j-a[i-1]]);

			}
		}
		System.out.println(dp[n][sum]);
	}
}