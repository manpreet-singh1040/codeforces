import java.util.*;

public class q31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t > 0 ){
            int n=sc.nextInt();
           String str=sc.next();
           boolean ans=false;
           int x=0;
           for(int i=1;i<n;i++){
               if(str.charAt(i)-'a'<str.charAt(i-1)-'a'){
                   ans=true;
                   x=i;
                   break;
               }
           }
           if(ans){
            System.out.println("YES");
            System.out.println((x)+" "+(x+1));
           }
           else{
            System.out.println("NO");
           }
           
            t--;
        }
        sc.close();
    }
    
}