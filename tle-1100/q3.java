import java.util.*;

public class q3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int brr[][]=new int[n][2];
            int temp[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                brr[i][0]=arr[i];
                brr[i][1]=i;
            }
            Comparator<int []> comp=(a,b)->{
                return a[0]-b[0];
            };
            int ans[]=new int[n];
            Arrays.sort(brr,comp);
            long sum=brr[0][0];
            int i=1;
            Stack<Integer> st=new Stack<>();
            st.add(brr[0][1]);
            int cur=0;
            while(i<n){
                // System.out.println(i+"  "+brr[i][0]+" --> "+sum);
                if(brr[i][0]<=sum){
                    cur++;
                    st.add(brr[i][1]);
                }
                else{
                    while(!st.isEmpty()){
                        ans[st.peek()]=cur;
                        st.pop();
                    }
                    st.add(brr[i][1]);
                    cur=i;
                }
                sum+=brr[i][0];
                i++;
            }
            while(!st.isEmpty()){
                ans[st.peek()]=cur;
                st.pop();
            }
            st.add(i);
            cur=i;
            for(int j:ans){
                System.out.print(j+" ");
            }
            System.out.println();
            t--;
        }
    }
}