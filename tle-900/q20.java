import java.util.*;
 public class q20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String str=sc.next();
            int b=0;
            int n=str.length();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='b') b++;
            }
            if(b==n || (str.charAt(0)=='a' && str.charAt(n-1)=='a') || (str.charAt(0)=='b' && str.charAt(n-1)=='b')   || n==1){
                System.out.println(str);
            }
            else if(n==2) System.out.println("aa");
            else{
                System.out.println("a"+str.substring(1, n-1)+"a");
            }
            t--;
        }
        sc.close();
    }
 }