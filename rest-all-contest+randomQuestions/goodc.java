import java.util.Scanner;

public class goodc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        goodc obj=new goodc();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long ans=obj.solve(1, n, k);
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    public long solve(int start,int end,int k)
    {
        if(end-start+1<k) return 0;
        long ans=0;
        int mid=start+(end-start)/2;
        if((end-start+1)%2==0)
        {
            return  solve(start,mid,k)+solve(mid+1,end,k);
        }
        else{
            ans=mid+solve(start,mid-1,k)+solve(mid+1,end,k);
            return ans;
        }
    }
}
