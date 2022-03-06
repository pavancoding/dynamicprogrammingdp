import java.util.*;
public class interleavingstring {
		static LinkedHashMap<String,Boolean> var;
		static boolean solution(String a,String b,String c,int len1,int len2,int len3,int p1,int p2,int p3){
			if(p3==len3)
			return p2==len2 && p1==len1?true:false;
			String key=String.valueOf(p1)+","+String.valueOf(p2)+","+String.valueOf(p3);
			if(var.containsKey(key))
			return var.get(key);
			boolean val;
			if(p2==len2 ){
			val= a.charAt(p1)==c.charAt(p3)?solution(a,b,c,len1,len2,len3,p1+1,p2,p3+1):false;
			var.put(key,val);
			return val;
			}
			if(p1==len1 ){
			val= b.charAt(p2)==c.charAt(p3)?solution(a,b,c,len1,len2,len3,p1,p2+1,p3+1):false;
			var.put(key,val);
			return val;
			}
			boolean one=false,two=false;
			if(a.charAt(p1)==c.charAt(p3)){
				one=solution(a,b,c,len1,len2,len3,p1+1,p2,p3+1);
			}
			if(b.charAt(p2)==c.charAt(p3)){
				two=solution(a,b,c,len1,len2,len3,p1,p2+1,p3+1);
			}
			var.put(key,one||two);
			return one || two;

		}
		public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next(),c=sc.next();
		var=new LinkedHashMap<String,Boolean>();
		System.out.println(solution(a,b,c,a.length(),b.length(),c.length(),0,0,0));
	}
}
