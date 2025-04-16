import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class c988 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            if(n<5)
            {
                System.out.println(-1);
            }
            else{
                Deque<Integer> dq=new ArrayDeque<Integer>();
                dq.addFirst(4);
                dq.addLast(5);
                for(int i=1;i<=n;i++)
                {
                    if(i!=4 && i!=5)
                    {
                        if(i%2==0)
                        {
                            dq.addFirst(i);
                        }
                        else{
                            dq.addLast(i);
                        }
                    }
                }
                for(int i=0;i<n;i++)
                {
                    System.out.print(dq.pollFirst()+" ");
                }
                System.out.println();
            }
            t--;
        }
        sc.close();
    }
}
