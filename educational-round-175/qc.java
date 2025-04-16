import java.util.*;

public class qc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            long ans=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int cur=arr[0];
            
            ArrayList<Integer> brr=new ArrayList<>();
            int x=0;
            for(int i=1;i<n;i++){
                if(str.charAt(i)==str.charAt(i-1)){
                    cur=Math.max(cur,arr[i]);
                }
                else{
                    brr.add(cur);
                    if(str.charAt(i-1)=='B') x++;
                    cur=arr[i];
                }
            }
            if(str.charAt(n-1)=='B') x++;
            brr.add(cur);
            System.out.println("the number of blue islands are -->"+x);
            if(k<x){
                Collections.sort(brr);
                ans=brr.get(x-k-1);
            }
            System.out.println("answer --> "+ans);
            t--;
        }
    }
}