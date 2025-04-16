import java.util.Scanner;
import java.util.*;

public class b988 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int k=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<k;i++)
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
            int y=k-2;
            int temp=(int)Math.pow(y, 0.5);
            if(temp*temp==y && map.containsKey(temp) && map.get(temp)>=2)
            {
                System.out.println(temp+" "+temp);
                t--;
                continue;
            }
            for(int i=1;i<=y;i++)
            {
                int z=y/i;

                if(z*i==y && map.containsKey(i) && map.containsKey(z))
                {
                    System.out.println(z+" "+i);
                    break;
                }
            }
            t--;
        }
        sc.close();
    }
}
