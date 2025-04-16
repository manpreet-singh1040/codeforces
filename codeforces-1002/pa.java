import java.util.*;
 public class pa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           int n=sc.nextInt();
           String ans="NO";
           TreeSet<Integer> a=new TreeSet<>();
           TreeSet<Integer> b=new TreeSet<>();
           int arr[]=new int[n];
           int brr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            a.add(arr[i]);
           }
           for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
            b.add(brr[i]);
           }
           if(a.size()>=2 && b.size()>=2) ans="YES";
           if(a.size()>=3 || b.size()>=3) ans="YES";
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
