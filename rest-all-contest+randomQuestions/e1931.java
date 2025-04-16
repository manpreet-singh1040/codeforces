import java.util.*;
public class e1931 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            int ans=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                int z=0;
                boolean flag=true;
                while(x>0){
                    int temp=x%10;
                    if(temp==0 && flag) z++;
                    else flag=false;
                    x=x/10;
                    ans++;
                }
                arr[i]=z;
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(i%2==0) ans-=arr[n-1-i];
            }
            if(ans>m) System.out.println("Sasha");
            else System.out.println("Anna");
            t--;
        }
        sc.close();
    }
}
