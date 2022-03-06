import java.util.*;
public class longestincreaseingsubsequence {
		public static void main(String arg[]){ 
			Scanner sc = new Scanner(System.in);
		    int n=sc.nextInt();
			int a[]=new int[n];
			int i;
			for(i=0; i<n; i++)a[i]=sc.nextInt();
			int dp[]=new int[n];
			Arrays.fill(dp,1);
			int j;
			for(i=1;i<n;i++){
				for(j=0;j<i;j++){
					if(dp[j]>=dp[i] && a[i]>a[j]){
						dp[i]=1+dp[j];
					}
				}
			}
			System.out.println(Arrays.toString(dp));
        }
}
