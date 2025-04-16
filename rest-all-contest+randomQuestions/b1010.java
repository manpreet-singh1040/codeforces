import java.util.*;
public class b1010 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long x=sc.nextInt();
            long n=sc.nextInt();
            long m=sc.nextInt();
            int ans[]=new int[2];
                long y=x;
                for(int i=0;i<n;i++){
                    y=y/2;
                    if(y==0) break;
                }
                for(int i=0;i<m;i++){
                    y=(y/2)+y%2;
                    if(y==0 || y==1) break;
                }
                ans[1]=(int)y;
                y=x;
                for(int i=0;i<m;i++){
                    y=(y/2)+y%2;
                    if(y==0 || y==1) break;
                }
                for(int i=0;i<n;i++){
                    y=y/2;
                    if(y==0) break;
                }
                ans[0]=(int)y;
            System.out.println(ans[0]+" "+ans[1]);
            t--;
        }
        sc.close();
    }
}
