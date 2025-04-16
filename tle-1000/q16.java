import java.util.*;

public class q16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            
            int r=sc.nextInt();
            int b=sc.nextInt();
            StringBuilder ans=new StringBuilder();
            int x=r/(b+1);
            int y=r%(b+1);
            while(ans.length()<n){
                for(int i=0;i<x && r>0;i++){
                    ans.append('R');
                    r--;
                }
                if(y>0){
                    ans.append('R');
                    y--;
                }
                if(b>0){
                    ans.append("B");
                    b--;
                }
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}