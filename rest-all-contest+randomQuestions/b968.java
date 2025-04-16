import java.util.Arrays;
import java.util.Scanner;

public class b968 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        int ans[]=new int[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=m.nextInt();
            }
            Arrays.sort(arr);
            n--;
            if(n%2==0)
            {
                n=n/2;
            }
            else{
                n=n/2;
                n++;
            }
            //for(int j=0;j<n;j++){System.out.println(arr[j]);}
            //System.out.println(n);
            ans[i]=arr[n];
            i++;
        }
        for(int j=0;j<t;j++)
        {
            System.out.println(ans[j]);
        }
        m.close();
    }
}
