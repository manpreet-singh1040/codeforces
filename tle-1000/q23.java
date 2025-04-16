import java.util.*;

public class q23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int d=sc.nextInt();
           long ans=1;
          
           int isPrime[]=new int[d*4+1];
           Arrays.fill(isPrime,1);
           for(int i=2;i*i<=d*4;i++){
            if(isPrime[i]==1){

                for(int j=i*i;j<=d*4;j+=i){
                    isPrime[j]=0;
                }
            }
           }
           int prev=1;
           for(int i=2;i<=d*4;i++){
            if(isPrime[i]==1 && i-prev>=d){
                // System.out.println("prime --> "+i);
                ans=ans*i;
                if(prev!=1){
                    break;
                }
                prev=i;
            }
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}