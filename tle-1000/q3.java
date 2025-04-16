import java.util.*;

public class q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int cost=sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            if(n==1){
                System.out.println(cost);
                t--;
                continue;
            }
            ArrayList<int []> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new int[]{arr[i],brr[i]});
            }
            Comparator<int []> comp=(a,b)->{
                return a[1]-b[1];
            };
            Collections.sort(temp,comp);
            if(temp.get(0)[1]>=cost){
                long xx=(long)cost*(long)(n);
                System.out.println(xx);
            }
            else{
                long curCost=cost;
                long curN=1;
                int i=0;
                while(curN<n && i<n && temp.get(i)[1]<cost){
                    if(n-curN<=temp.get(i)[0]) curCost+=(temp.get(i)[1]*(n-curN));
                    else curCost+=((long)temp.get(i)[1]*(long)temp.get(i)[0]);
                    curN+=(long)temp.get(i)[0];
                    i++;
                }
                if(curN<n) curCost+=((long)cost*(long)(n-curN));
                System.out.println(curCost);


            }
            t--;
        }
        sc.close();
    }
}