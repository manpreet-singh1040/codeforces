import java.util.Scanner;
import java.util.*;
public class a906 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String ans="yes";
            int n=sc.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            int a=-1;
            int b=-1;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i]))
                {
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1);
                    if(a==-1 && b==-1) a=arr[i];
                    if(b==-1 && a!=arr[i]) b=arr[i];
                }
            }
            if(n<=2)
            {
                System.out.println(ans);
            }
            else if(map.size()==1)
            {
                System.out.println("YES");
            }
            else if(map.size()>2)
            {
                System.out.println("NO");
            }
            else
            {
                int x=map.get(a);
                int y=map.get(b);
                if(Math.abs(x-y)<=1)
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            t--;
        }
        sc.close();
    }
}
