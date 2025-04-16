import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
public class edub172 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                if(map.containsKey(x))
                {
                    map.put(x,map.get(x)+1);
                }
                else{
                    map.put(x,1);
                }
            }
            int arr[]=new int[map.size()];
            int i=0;
            int one=0;
            for(Map.Entry<Integer,Integer> elm : map.entrySet())
            {
                arr[i]=elm.getValue();
                i++;
                if(elm.getValue()==1)
                {
                    one++;
                }
            }
            Arrays.sort(arr);
            int ans=0;
            if(one%2==0)
            {
                ans=(one/2)*2;
                ans+=((arr.length-one));
            }
            else
            {
                ans=(one/2+1)*2;
                ans+=(arr.length-one);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
