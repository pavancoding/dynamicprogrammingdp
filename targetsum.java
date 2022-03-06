import java.util.*;
class targetsum{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int sum=0;
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int target=sc.nextInt();
		int x=((sum+target)/2);
		int dp[][]=new int[n+1][x+1];
		for(i=0;i<=n;i++){
			dp[i][0]=1;
		}
		for(i=1;i<=x;i++){
			dp[0][i]=0;
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=x;j++){
				if(a[i-1]>j)
				dp[i][j]=dp[i-1][j];
				else
				dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i-1]];
			}
		}
		System.out.println(dp[n][x]);
	}
}