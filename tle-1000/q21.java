import java.util.*;

public class q21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            String a=sc.next();
            String b=sc.next();
            int n=a.length();
            int m=b.length();
            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(b.contains(a.substring(i,j+1))){
                        ans=Math.max(ans,(j-i+1));
                    }
                }
            }
            System.out.println((n-ans+m-ans));
            t--;
        }
        sc.close();
    }
    
}