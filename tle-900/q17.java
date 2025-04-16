import java.util.*;
 public class q17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int ans=0;
            int arr[]=new int[n];
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
                else map.put(arr[i],1);
            }
            int max=0;
            for(Map.Entry<Integer,Integer> i: map.entrySet()){
                max=Math.max(max,i.getValue());
            }
            ans+=(n-max);
            int x=n-max;
            int cur=max;
            while(x>0){
                ans++;
                x-=(cur);
                cur=(cur<<1);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
 }