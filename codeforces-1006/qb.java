import java.util.*;

public class qb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str=sc.next();
            int up=0;
            int dw=0;
            
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='-') up++;
                else dw++;
            }
            long ans=0;
            int temp1=up/2;
            int temp2=up/2+(up%2);
            ans=((long)temp1*(long)temp2*dw);
            System.out.println(ans);
            t--;
        }
    }
}