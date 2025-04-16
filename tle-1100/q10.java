import java.util.*;

public class q10 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            String ans="NO";
            Queue<Integer> q1=new LinkedList<>();
            Queue<Integer> q2=new LinkedList<>();
            Queue<Integer> q3=new LinkedList<>();
            for(int i=0;i<n;i++){
                q1.add(sc.nextInt());
            }
            for(int i=0;i<n;i++){
                q2.add(sc.nextInt());
            }
            for(int i=0;i<n;i++){
                q3.add(sc.nextInt());
            }
            int temp=0;
            while(!q1.isEmpty() && temp!=x){
                if(check(x,q1.peek())){
                    temp=(temp | q1.poll());
                }
                else{
                    break;
                }

            }
            while(!q2.isEmpty() && temp!=x){
                if(check(x,q2.peek())){
                    temp=(temp | q2.poll());
                }
                else{
                    break;
                }

            }
            while(!q3.isEmpty() && temp!=x){
                if(check(x,q3.peek())){
                    temp=(temp | q3.poll());
                }
                else{
                    break;
                }

            }
            if(temp==x) ans="YES";
            System.out.println(ans);
            t--;
        }
    }
    static boolean check(int x,int y){
        for(int i=0;i<32;i++){
            int p=(x & (1<<i))==0 ? 0:1; 
            int q=(y & (1<<i))==0 ? 0:1; 
            if(p==0 && q==1){
                return false;
            }
        }
        return true;
    }
}