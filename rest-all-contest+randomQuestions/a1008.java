import java.util.*;
public class a1008 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[2*n];
            for(int i=0;i<2*n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            long ans=arr[0]+arr[2*n-1];
            int i=1;
            int j=2*n-2;
            while(i<j){
                ans+=arr[j]-arr[i];
                i++;
                j--;
            }
            ArrayList<Long> temp=new ArrayList<>();
            temp.add((long)arr[2*n-1]);
            temp.add(ans);
            temp.add((long)arr[0]);
            i=1;
            j=2*n-2;
            while(i<j){
                temp.add((long)arr[i]);
                temp.add((long)arr[j]);
                i++;
                j--;
            }
            for(Long xx:temp){
                System.out.print(xx+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
