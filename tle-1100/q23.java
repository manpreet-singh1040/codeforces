import java.util.*;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            String ans="YES";
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=i+1;
                if(l%x==0 || r%x==0){
                    arr.add( (l%x==0) ? l: r );
                }
                else{
                    int p=l/x;
                    int q=r/x;
                    if(q-p>0){
                        arr.add(q*x);
                    }
                    else{
                        ans="NO";
                        break;
                    }
                }
            }
            System.out.println(ans);
            if(ans.charAt(0)=='Y'){
                for(int i:arr){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            t--;
        }
    }
}