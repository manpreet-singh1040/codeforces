import java.util.HashMap;
import java.util.Scanner;

public class a967 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        int ans[]=new int[t];
        int i=0;
        while(i<t)
        {
            int s=m.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            int max=0;
            for(int j=0;j<s;j++)
            {
                int temp=m.nextInt();
                if(map.containsKey(temp))
                {
                    map.put(temp,map.get(temp)+1);
                }
                else{
                    map.put(temp,1);
                }
                if(map.get(temp)>max)
                {
                    max=map.get(temp);
                }
            }
            ans[i]=s-max;
            i++;
        }
        for(int q:ans)
        {
            System.out.println(q);
        }
        m.close();
    }
}
