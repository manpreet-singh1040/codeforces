import java.util.*;

public class q18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            long ans=0;
            long w=sc.nextLong();
            long h=sc.nextLong();
            int n1=sc.nextInt();
            int x1[]=new int[n1];
            for(int i=0;i<n1;i++){
                x1[i]=sc.nextInt();
            }
            int n2=sc.nextInt();
            int x2[]=new int[n2];
            for(int i=0;i<n2;i++){
                x2[i]=sc.nextInt();
            }
            int n3=sc.nextInt();
            int y1[]=new int[n3];
            for(int i=0;i<n3;i++){
                y1[i]=sc.nextInt();
            }
            int n4=sc.nextInt();
            int y2[]=new int[n4];
            for(int i=0;i<n4;i++){
                y2[i]=sc.nextInt();
            }
            ans=Math.max(ans, ( Math.abs(x1[0]-x1[n1-1])*h ) );
            ans=Math.max(ans, ( Math.abs(x2[0]-x2[n2-1])*h ) );
            ans=Math.max(ans,  (Math.abs(y1[0]-y1[n3-1])*w) );
            ans=Math.max(ans,  (Math.abs(y2[0]-y2[n4-1])*w) );

            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}