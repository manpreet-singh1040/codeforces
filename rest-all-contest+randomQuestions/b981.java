import java.util.Scanner;

public class b981 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int dis=0;
            for(int i=1;i<n;i++)
            {
                if(arr[i-1]==arr[i] && arr[(2*n-i)%n]!=arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[(2*n-i)%n];
                    arr[(2*n-i)%n]=temp;
                }
            }
            for(int i=1;i<n;i++)
            {
                if(arr[i-1]==arr[i]) dis++;
            }
            System.out.println(dis);
            t--;
        }
        sc.close();
    }
}
