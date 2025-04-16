import java.util.Scanner;

public class a972 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        int[] ans=new int[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int temp=m.nextInt();
            int temp1=m.nextInt();
            int t1=m.nextInt();
            int t2=m.nextInt();
            int s=m.nextInt();
            if(t2<t1)
            {
                int qqq=t1;
                t1=t2;
                t2=t1;
            }
            if(s==t1 || s==t2)
            {
                ans[i]=0;
            }
            else if(s<t1 && s<t2)
            {
                ans[i]=t1-1;
            }
            else if(s>t1 && s>t2)
            {
                ans[i]=n-t2;
            }
            else
            {
                int y=t1+(t2-t1)/2;
                ans[i]=Math.min(y-t1,t2-y);
            }
            i++;
        }
        for(int j:ans)
        {
            System.out.println(j);
        }
        m.close();
    }
}
