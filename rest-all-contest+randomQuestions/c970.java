import java.util.Scanner;

public class c970 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        double[] ans=new double[t];
        int i=0;
        while(i<t)
        {
            double l=m.nextInt();
            double r=m.nextInt();
           if(r-l<=2)
           {
            ans[i]=r-l+1;
           }
           else{
            double q=r-l;
            double y=Math.sqrt(1+8*q);
            double x=(y-1)/2;
            ans[i]=1+(int)x;
           }
            i++;
        }
        for(double j:ans)
        {
            System.out.println((int)j);
        }
        m.close();
    }
}
