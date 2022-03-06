import java.util.*;
public class longestrepeatingsubsequence {
	public static int max(int a,int b){
		return a>b?a:b;
	}
	public static void main(String arg[]){ 
		Scanner sc=new Scanner(System.in);
		String val=sc.next();
		sc.close();
		int dp[][]=new int[val.length()+1][val.length()+1];
		int n=val.length();
		int i,j;
		for(i=0;i<=n;i++){
		dp[i][0]=0;
		dp[0][i]=0;
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(val.charAt(i-1)==val.charAt(j-1) && i!=j){
					dp[i][j]=1+dp[i-1][j-1];
					
				}
				else
				dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
			}
		}
		System.out.println(dp[n][n]);
	}
}
