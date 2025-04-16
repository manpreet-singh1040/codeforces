import java.util.*;

public class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int one=0;
            int zero=0;
            String str=sc.next();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') one++;
                else zero++;
            }
            int ans=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1'){
                    if(zero>0){ zero--; ans++;}
                    else break;
                }
                else{
                    if(one>0) {one--; ans++; }
                    else break;
                }
            }
            System.out.println(str.length()-ans);
            t--;
        }
        sc.close();
    }
}