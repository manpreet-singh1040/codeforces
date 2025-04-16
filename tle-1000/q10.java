import java.util.*;

public class q10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int n=sc.nextInt();
           String c=sc.nextLine();
           String str=sc.next();
        //    System.out.println(str+" --> "+c.charAt(1));
           if(c.charAt(1)=='g') System.out.println(0);
           else{
            int ans=Integer.MIN_VALUE;
            char x=c.charAt(1);
            int cur=-1;
            for(int i=0;i<n;i++){
                if(str.charAt(i)==x && cur==-1){
                    cur=i;
                }
                else if(str.charAt(i)=='g' && cur!=-1){
                    ans=Math.max(ans,i-cur);
                    cur=-1;
                }
            }
            if(cur!=-1){
                int qw=0;
                for(int i=0;i<n;i++){
                    if(str.charAt(i)=='g'){
                        qw=i;
                        break;
                    }
                }
                ans=Math.max(ans,n-cur+qw);
            }
            System.out.println(ans);
           }

            t--;
        }
        sc.close();
    }
}