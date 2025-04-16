import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

public class problemB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
           int n=sc.nextInt();
           int l=sc.nextInt();
           int r=sc.nextInt();
           int arr[]=new int[n];
           l--;
           r--;
           ArrayList<Integer> arr1=new ArrayList<>();
           ArrayList<Integer> arr2=new ArrayList<>();
           ArrayList<Integer> arr3=new ArrayList<>();
           for(int i=0;i<n;i++)
           {
              arr[i]=sc.nextInt();
              if(i<l) arr1.add(arr[i]);
              if(i>r) arr2.add(arr[i]);
              if(i>=l && i<=r){
                arr3.add(arr[i]);
              }
           }
           Collections.sort(arr1);
           Collections.sort(arr2);
           Comparator<Integer> comp=(a,b)->{
            return b-a;
           };
           Collections.sort(arr3,comp);
           int ans=Integer.MAX_VALUE;
           long sum1=0;
           long sum2=0;
           for(int i=l,j=r;i<=r;i++,j--)
           {
               if(i-l<arr1.size())
               {
                  sum1+=Math.min(arr1.get(i-l),arr3.get(i-l));
               }
               else{
                sum1+=arr3.get(i-l);
               }
               if(i-l<arr2.size())
               {
                  sum2+=Math.min(arr2.get(i-l),arr3.get(i-l));
               }
               else{
                sum2+=arr3.get(i-l);
               }

           }
           System.out.println(Math.min(sum1,sum2));
            t--;
        }
        sc.close();
    }
}
