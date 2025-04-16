import java.util.*;

public class codeforces1001a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            String str=sc.next();
            int ans=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') ans++;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}