import java.util.Scanner;

public class c987 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            if(n==1 || ( n<=25  && n%2==1))
            {
                System.out.println(-1);
            }
            else{
                if(n>26 && n%2==1)
                {
                    int arr[]=new int[n];
                    int x=3;
                    int k=n/9;
                    arr[0]=1;
                    arr[9]=1;
                    arr[25]=1;
                    arr[10]=2;
                    arr[26]=2;
                    for(int i=0;i<n;i++)
                    {
                        if(arr[i]==0)
                        {
                            arr[i]=x;
                            arr[i+1]=x;
                            i++;
                            x++;
                        }
                    }
                    for(int i: arr)
                    {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
                else{
                    
                    for(int i=0;i<n/2;i++)
                    {
                        int x=i+1;
                        System.out.print(x+" "+x+" ");
                    }
                    System.out.println();
                }
            }
            
            t--;
        }
        sc.close();
    }
}
