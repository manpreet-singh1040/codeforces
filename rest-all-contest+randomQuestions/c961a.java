import java.util.*;
public class c961a {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        int i=0;
        int arr[][]=new int[t][2];
        while(i<t)
        {
            arr[i][0]=m.nextInt();
            arr[i][1]=m.nextInt();
            i++;
        }
        i=0;
        int ans[]=new int[t];
        while(i<t)
        {
            int n=arr[i][0];
            int x=arr[i][1];
            if(x==0)
            {
                ans[i]=0;
            }
            else{
                int ref[]=new int[n+1];
                int min=0;
                if(x>=n)
                {
                    x=x-n;
                    min++;
                }
                int cur=n-1;
                while(x>0)
                {
                    if(x-ref[cur]>=0 &&  ref[cur]<2)
                    {
                        x=x-cur;
                        ref[cur]++;
                        min++;
                        if(ref[cur]==2)
                        {
                            cur--;
                        }
                    }
                    else{
                        cur--;
                    }
                }
                ans[i]=min;
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
