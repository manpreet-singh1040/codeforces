import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            PriorityQueue<Integer> pq1=new PriorityQueue<>();
            PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                pq1.add(i+1);
                pq2.add(i+1);
            }
            int i=0;
            int j=n-1;
            while(i<j){
                if(pq1.peek()!=arr[i] && pq1.peek()!=arr[j] && pq2.peek()!=arr[i] && pq2.peek()!=arr[j]){
                    i++;
                    j++;
                    break;
                }
                else if(pq1.peek()==arr[i]){ pq1.remove(arr[i]);  i++;  }
                else if(pq2.peek()==arr[j]) { pq2.remove(arr[j]);   j--;}
                else if(pq1.peek()==arr[j]) { pq1.remove(arr[j]);  j--;}
                else if(pq2.peek()==arr[i]) { pq2.remove(arr[i]);  i++;}
            }
            if(i>=j) System.out.println(-1);
            else System.out.println(i+" "+j);
            t--;
        }
        sc.close();
    }

    static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        else {
            if (a >= b)
                return gcd(a % b, b);
            else
                return gcd(b % a, a);
        }
    }
}