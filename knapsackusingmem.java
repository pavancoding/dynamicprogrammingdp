import java.util.*;
public class knapsackusingmem {
	static int mem[][];
	static int max(int a,int b){
		return a>b?a:b;
	}
	static int knapsack(int w[],int p[],int weight,int n){
		if(n==0 || weight ==0)
		return 0;
		if(mem[n][weight]!=-1)
		return mem[n][weight];
		int result;
		if(w[n-1]>weight)
		result= knapsack(w,p,weight,n-1);
		else
		result= max(knapsack(w,p,weight,n-1),knapsack(w,p,weight-w[n-1],n-1)+p[n-1]);
		mem[n][weight]=result;
		return result;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int w[]=new int[n];
	int profit[]=new int[n];
	int i;
	for(i=0;i<n;i++)
	w[i]=sc.nextInt();
	for(i=0;i<n;i++)
	profit[i]=sc.nextInt();
	int weigth=sc.nextInt();
	mem=new int[n+1][weigth+1];
	for(i=0;i<=n;i++)
	Arrays.fill(mem[i],-1);
	knapsack(w,profit,weigth,n);
	System.out.println(mem[n][weigth]);
}
}