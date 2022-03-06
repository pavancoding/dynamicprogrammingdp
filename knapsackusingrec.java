import java.util.*;
class knapsackusingrec{
	static int max(int a,int b){
		return a>b?a:b;
	}
	static int knapsack(int w[],int p[],int weight,int n){
		if(n==-1 || weight ==0)
		return 0;
		if(w[n]>weight)
		return knapsack(w,p,weight,n-1);
		else
		return max(knapsack(w,p,weight,n-1),knapsack(w,p,weight-w[n],n-1)+p[n]);
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
	System.out.println(knapsack(w,profit,weigth,n-1));
}}