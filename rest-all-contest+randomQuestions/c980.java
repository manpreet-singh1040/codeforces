import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class c980 {
    public static void main(String[] args) {
        java.util.Scanner m=new java.util.Scanner(System.in);
        int t=m.nextInt();
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int arr[][]=new int[n][2];
            for(int j=0;j<n;j++)
            {
                arr[j][0]=m.nextInt();
                arr[j][1]=m.nextInt();
            }
            Comparator<int []> comp=(a,b)->{
                int inv1=0;
                int inv2=0;
                int temp[]=new int[4];
                temp[0]=a[0];
                temp[1]=a[1];
                temp[2]=b[0];
                temp[3]=b[1];
                for(int j=0;j<4;j++)
                {
                    for(int k=j+1;k<4;k++)
                    {
                        if(temp[j]>temp[k])
                        {
                            inv1++;
                        }
                    }
                }
                temp[0]=b[0];
                temp[1]=b[1];
                temp[2]=a[0];
                temp[3]=a[1];
                for(int j=0;j<4;j++)
                {
                    for(int k=j+1;k<4;k++)
                    {
                        if(temp[j]>temp[k])
                        {
                            inv2++;
                        }
                    }
                }
                //System.out.println("--> "+inv1+" "+inv2);
                if(inv1>inv2) return 1;
                else if(inv1<inv2) return -1;
                else {
                    if(a[0]>a[1] && b[0]<b[1]) return -1;
                    else if(a[0]>a[1] && b[0]<b[1]) return -1;
                    else if(a[0]<a[1] && b[0]<b[1]) return -1;
                    else if(a[0]<a[1] && b[0]>b[1]) return 1;
                    else return 0;
                }
            };
            Arrays.sort(arr,comp);
            for(int []q:arr)
            {
                for(int j:q)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
            i++;
        }
        // for(int j:ans)
        // {
        //     System.out.println(j);
        // }
        m.close();
    }
}
