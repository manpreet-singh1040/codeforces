import java.util.*;
public class qa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            double x=sc.nextInt();
            double sum=0;
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                sum+=temp;
            }
            if(sum/n==x) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        sc.close();
    }
}