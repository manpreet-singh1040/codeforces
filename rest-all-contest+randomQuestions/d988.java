import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
public class d988 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int h=sc.nextInt();
            int p=sc.nextInt();
            int l=sc.nextInt();
            int hurdle[][]=new int[h][2];
            int power[][]=new int[p][2];
            for(int i=0;i<h;i++)
            {
                hurdle[i][0]=sc.nextInt();
                hurdle[i][1]=sc.nextInt();

            }
            for(int i=0;i<p;i++)
            {
                power[i][0]=sc.nextInt();
                power[i][1]=sc.nextInt();

            }
            // Comparator<int []> comp=(a,b)->{
            //     // long aa=a;
            //     // long bb=b;
            //     return a[0]-b[0];
            // };
            // Arrays.sort(power,comp);
            // Arrays.sort(hurdle,comp);
            int curp=1;
            int ans=0;
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            boolean flag=false;
            int i=0;
            int j=0;
            while(i<h)
            {
                while(j<p && power[j][0]<hurdle[i][0])
                {
                    pq.add(power[j][1]);
                    j++;
                }
                while(!pq.isEmpty() && curp<hurdle[i][1]-hurdle[i][0]+2)
                {
                    curp+=pq.poll();
                    ans++;
                }
                if(curp<hurdle[i][1]-hurdle[i][0]+2)
                {
                    // System.out.println(-1);
                    flag=true;
                    break;
                }
                i++;
            }
            if(flag) System.out.println(-1);
            else{
                if(i!=h) System.out.println(-1);
                else System.out.println(ans);
            }
            t--;
        }
        sc.close();
    }
}
