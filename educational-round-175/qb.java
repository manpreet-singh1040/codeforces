import java.util.*;

public class qb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x=sc.nextInt();
            long k=sc.nextLong();
            String str=sc.next();
            long ans=0;
            int temp[]=new int[n];
            int cur=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='L') cur--;
                else cur++;
                temp[i]=cur;
            }
            int flag=0;
            for(int i=0;i<n;i++){
                if(temp[i]==-x){
                    ans++;
                    flag=1;
                    k-=(i+1);
                    break;
                }
            }
            if(flag==1){
                long fz=-1;
                for(int i=0;i<n;i++){
                    if(temp[i]==0){
                        fz=i;
                        break;
                    }
                }
                if(fz!=-1){
                    fz++;
                    ans+=(k/fz);
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}