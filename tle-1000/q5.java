import java.util.*;

public class q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<int []> arr=new ArrayList<>();
            ArrayList<Integer> arr2=new ArrayList<>();
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(temp%k==0) arr2.add(i+1);
                else arr.add(new int[]{temp%k,i});
            }
            Comparator< int[]> comp=(a,b)->{
                if(a[0]==b[0]) return (a[1]>b[1] ? 1 : -1);
                return (a[0]>b[0] ? -1: 1);
            };
            Collections.sort(arr,comp);
            for(int i: arr2){
                System.out.print(i+" ");
            }
            for(int i[]:arr){
                System.out.print( (i[1]+1)+" " );
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}