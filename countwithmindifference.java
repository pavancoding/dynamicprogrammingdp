import java.util.*;
public class countwithmindifference {
	public static void main(String arg[]){ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int val=sc.nextInt();
		int dp[][]=new int[n+1][sum+1];
		int j;
		for(i=0;i<=n;i++) {
			dp[i][0]=1;
		}
		for(i=1;i<=sum;i++) {
			dp[0][i]=0;
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=sum;j++) {
				if(a[i-1]>j){
				dp[i][j]=dp[i-1][j];}
				else
				dp[i][j]=(dp[i-1][j]+dp[i-1][j-a[i-1]]);
			}
		}
		System.out.println(dp[n][(sum+val)/2]);
	}
}
