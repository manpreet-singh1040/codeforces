import java.util.*;

public class qb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            if(! check((n*(n+1))/2) ){
                for(int i=1;i<=n;i++){
                    
                    if( i==1 || ( ( i%2==1 && check((i+1)/2) && check(i) ) || ( i%2==0 && check((i+1)) && check(i/2)  ) ) ){
                        System.out.print((i+1)+" ");
                        System.out.print((i)+" ");
                        i++;
                    }
                    else{
                        System.out.print((i)+" ");
                    }
                }

                System.out.println();
            }
            else{
                System.out.println(-1);
            }
            t--;
        }
        sc.close();
    }
    static boolean check(int x){
        int y=(int)Math.sqrt(x);
        return (y*y==x);
    }
    
}