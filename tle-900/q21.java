import java.util.*;
 public class q21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            if(n<25){
                System.out.println( n<10 ? "1":"2");
            }
            else{
                Queue<Integer> q=new LinkedList<>();
                Queue<Integer> q2=new LinkedList<>();
                while(n>0){
                    q.add((int)(n%10));
                    q2.add((int)(n%10));
                    n=n/10;
                }
                int x=-1;
                int y=-1;
                int ans=0;
                int f=0;
                while(!q.isEmpty()){
                    if(q.peek()==5){
                        if(x==-1)
                        x=5;
                        else ans++;
                        
                    }
                    else if((q.peek()==2 || q.peek()==7) && x!=-1)
                    {
                        f=1;
                        break;
                    } 
                    else ans++;
                    q.remove();
                }
                if(f==0) ans++;
                x=-1;
                y=-1;
                int max=0;
                f=0;
                while(!q2.isEmpty()){
                    if(q2.peek()==0){
                        if(x==-1)
                        x=0;
                        else {
                            f=1;
                            break;
                        }
                        
                    }
                    else if(( q2.peek()==5) && x!=-1)
                    {
                        f=1;
                        break;
                    } 
                    else max++;
                    q2.remove();
                }
                if(f==0) max++;
                System.out.println(Math.min(ans,max));
            }
            t--;
        }
        sc.close();
    }
 }