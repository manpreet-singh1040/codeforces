import java.util.ArrayList;
import java.util.Scanner;

public class b967 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i<t)
        {
            int temp=m.nextInt();
            i++;
            ArrayList<Integer> q1=new ArrayList<>();
            if(temp%2==0)
            {
                q1.add(-1);
                ans.add(q1);
            }
            else{
                int x=0;
                int j=1;
                int k=temp;
                while(x<temp)
                {
                    if(x%2==0)
                    {
                        q1.add(j);
                        j++;
                    }
                    else{
                        q1.add(k);
                        k--;
                    }
                    x++;
                }
                ans.add(q1);
            }
        }
        for(int j=0;j<t;j++)
        {
            for(int k:ans.get(j))
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        m.close();
    }
}
