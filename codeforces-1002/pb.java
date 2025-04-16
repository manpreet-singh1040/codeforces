import java.util.*;
 public class pb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           int n=sc.nextInt();
           int k=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           int ans=1;
           if(n==k){
            int x=1;
            for(int i=1;i<n;i+=2){
                if(arr[i]==x){
                    ans++;
                    x++;
                }
                else{
                    break;
                }
            }
           }
           else{
            TreeSet<Integer> set=new TreeSet<>();
            for(int i=1;i<n-k+2;i++){
                set.add(arr[i]);
            }
            if(!set.contains(1)) ans=1;
            else{
                if(set.size()>=2) ans=1;
                else if(set.size()==1) ans=2;
            }
           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
