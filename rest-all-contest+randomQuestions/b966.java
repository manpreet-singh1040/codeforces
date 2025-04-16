import java.util.Scanner;

public class b966 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        String ans[]=new String[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=m.nextInt();
            }
            boolean check=true;
            arr[arr[0]-1]=arr[arr[0]-1]*-1;
            for(int j=1;j<n;j++)
            {
                int x=arr[j];
                if(x<0)
                {
                    x=x*-1;
                }
                x--;
                if(x==0)
                {
                    if(x+1<n && arr[x+1]>0)
                    {
                        check=false;
                        break;
                    }
                }
                if(x==n-1)
                {
                    if(x-1>=0 && arr[x-1]>0)
                    {
                        check=false;
                        break;
                    }
                }
                if(x!=0 && x!=n-1)
                {
                    if(arr[x-1]>0 && arr[x+1]>0)
                    {
                        check=false;
                        break;
                    }
                }
                arr[x]=arr[x]*-1;
            }
            if(check)
            {
                ans[i]="yes";
            }
            else{
                ans[i]="no";
            }
            i++;
        }
        for(String q:ans)
        {
            System.out.println(q);
        }
        m.close();
    }
}
