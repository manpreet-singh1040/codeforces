import java.util.*;
public class c961b1 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        int i=0;
        int arr[][]=new int[t][2];
        ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        while(i<t)
        {
            arr[i][0]=m.nextInt();
            arr[i][1]=m.nextInt();
            ArrayList<Integer> q=new ArrayList<>();
            for(int y=0;y<arr[i][0];y++)
            {
                int kk=m.nextInt();
                q.add(kk);
            }
            arr1.add(q);
            i++;
        }
        i=0;
        int ans[]=new int[t];
        while(i<t)
        {
            int n=arr[i][0];
            int x=arr[i][1];
            ArrayList<Integer> temp=arr1.get(i);
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int as:temp)
            {
                if(map.containsKey(as))
                {
                    map.put(as,map.get(as)+1);
                }
                else{
                    map.put(as,1);
                }
            }
            int max=0;
            for(Map.Entry<Integer,Integer> qw:map.entrySet()){
                int sum=0;
                int v1=qw.getKey();
                int f1=qw.getValue();
                int v2=-1;
                int f2=-1;
                if(map.containsKey(v1-1))
                {
                    v2=
                }
            }

            i++;
        }
        for(int j:ans)
        {
            System.out.println(j);
        }
        m.close();
    }
    int fun(int arr[],int k)
    {
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<=j)
        {
            ans
        }
    }
}

