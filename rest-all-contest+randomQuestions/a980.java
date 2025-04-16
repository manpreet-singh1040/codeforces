import java.util.Scanner;

public class a980 {
 public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int p=m.nextInt();
            if(n>=p) System.out.println(n);
            else{
                if(2*n-p>0)
                System.out.println(2*n-p);
                else 
                System.out.println(0);
            }
            i++;
        }
        // for(int j:ans)
        // {
        //     System.out.println(j);
        // }
        m.close();
    }
    
}