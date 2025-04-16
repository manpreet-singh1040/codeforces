import java.util.*;

public class q20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=a;
            int xor=0;
            
            if( (a-1)%4==0 ) xor=a-1;
            else if((a-1)%4==1) xor=1;
            else if( (a-1)%4==2 ) xor=a;
            else xor=0;
            if(xor!=b){
                if((xor^b)==a) ans+=2;
                else ans++;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    
}