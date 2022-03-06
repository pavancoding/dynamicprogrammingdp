import java.util.*;
public class rocduttingmemorization {
	static int max(int a,int b){
		return a>b?a:b;
	}
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int length[]=new int[n];
		int price[]=new int[n];
		for(i=0;i<n;i++)length[i]=sc.nextInt();
		for(i=0;i<n;i++)price[i]=sc.nextInt();
		int sum=sc.nextInt();
		int dp[][]=new int[n+1][sum+1];
		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++){
				if(length[i-1]>j)
				dp[i][j]=dp[i-1][j];
				else
				dp[i][j]=max(dp[i-1][j],price[i-1]+dp[i][j-length[i-1]]);
			}
		}
		for(i=0;i<=n;i++)
		System.out.println(Arrays.toString(dp[i]));
		System.out.println(dp[n][sum]);
	}
}
