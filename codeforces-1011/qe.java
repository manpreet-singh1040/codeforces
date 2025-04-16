import java.util.*;
public class qe{
    public static void main(String args[]){
        int isPrime[]=new int[10000001];
        isPrime[0]=1;
        isPrime[1]=1;
        ArrayList<Integer> prime=new ArrayList<>();
        for(int i=2;i*i<=10000000;i++){
            if(isPrime[i]==0){
                prime.add(i);
                for(int j=i*i;j<=10000000;j+=i){
                    isPrime[j]=1;
                }
            }
        }
        int cum[]=new int[10000001];
        int cur=0;
        for(int i=0;i<=10000000;i++){
            if(isPrime[i]==0) cur++;
            cum[i]=cur;
        }
        // for(int i=0;i<=10;i++){
        //     System.out.println(cum[i]);
        // }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long ans=0;
            for(int i=1;i<=n;i++){
                int x=n/i;
                ans+=cum[x];
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static boolean check(long k,long m,long ans){
        boolean res=true;
        long req=k+(k/ans + ( (k%ans==0) ? 0 : 1 )-1 );
        res=(req<=m);
        return res;
    }
}