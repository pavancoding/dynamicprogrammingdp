import java.util.*;
public class longestcommonsupersequence {
	static int max(int a,int b){
		return 	a>b?a:b;
	}
	public static void main(String arg[]){ 
		Scanner sc=new Scanner(System.in);
		String str1=sc.next(),str2=sc.next();
		int n=str1.length();
		int m=str2.length();
		sc.close();
		int dp[][]=new int[n+1][m+1];
		int i,j;
		for(i=0;i<=n;i++)
		dp[i][0]=0;
		for(i=1;i<=m;i++)
		dp[0][i]=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1))
				dp[i][j]=1+dp[i-1][j-1];
				else
				dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
			}
		}
		for(i=0;i<=n;i++)
		System.out.println(Arrays.toString(dp[i]));
		String ans="";
		i=n;j=m;
		while(dp[i][j]!=0){
			if((dp[i-1][j-1]>dp[i-1][j] && dp[i-1][j-1]>dp[i][j-1]) || (dp[i-1][j-1]==dp[i-1][j] && dp[i-1][j-1]==dp[i][j-1] && dp[i-1][j-1]!=dp[i][j]) ){
				ans=String.valueOf(str1.charAt(i-1))+ans;
				i=i-1;
				j=j-1;
				
			}
			else if( (dp[i-1][j-1]==dp[i-1][j] && dp[i-1][j-1]==dp[i][j-1] && dp[i-1][j-1]==dp[i][j]) ){
				i=i-1;
			}
			else if(dp[i-1][j]<=dp[i][j-1])
			{
				j=j-1;
			}
			else
			i=i-1;
		}
		System.out.println((n+m)-ans.length());
		int o=ans.length();
		int k;
		i=0;j=0;k=0;
		String ans2="";
		while(i<n && j<m && k<o){
			while(i<n && str1.charAt(i)!=ans.charAt(k)){
				ans2+=String.valueOf(str1.charAt(i));
				i++;
			}
			while(j<m && str2.charAt(j)!=ans.charAt(k)){
				ans2+=String.valueOf(str2.charAt(j));
				j++;
			}
			ans2+=String.valueOf(ans.charAt(k));
			k++;
			j++;
			i++;
		}
		while(i<n){
			ans2+=String.valueOf(str1.charAt(i));
			i++;
		}
		while(j<m){
			ans2+=String.valueOf(str2.charAt(j));
			j++;
		}
		System.out.println(ans2);
	}
}
