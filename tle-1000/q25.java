import java.util.*;

public class q25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            // int k=sc.nextInt();
            TreeSet<Integer> set=new TreeSet<>();
            String ans="NO";
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(set.contains(arr[i])) ans="YES";
                else set.add(arr[i]);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}