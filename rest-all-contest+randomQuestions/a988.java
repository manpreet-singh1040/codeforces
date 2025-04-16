import java.util.*;
public class a988 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            int ans=0;
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                if(set.contains(x))
                {
                    ans++;
                    set.remove(x);
                }
                else{
                    set.add(x);
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
