import java.util.*;
public class goodb {
    public static void main(String[] args) {
        goodb obj=new goodb();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[][]=new int[n][2];
            TreeMap<Integer, Integer> map=new TreeMap<>();
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
                if(arr[i][0]==arr[i][1])
                {
                    if(map.containsKey(arr[i][0]))
                    {
                        map.put(arr[i][0],2);
                    }
                    else{
                       temp.add(arr[i][0]);
                    map.put(arr[i][0],1);
                   }
                }
            }
            Collections.sort(temp);
            StringBuilder ans=new StringBuilder();
            int size=temp.size();
            for(int i[]:arr)
            {
                int start=i[0];
                int end=i[1];
                char c='0';
                if(start==end)
                {
                    if(map.get(start)==1)
                    {
                        c='1';
                    }
                }
                else if(end-start+1>size)
                {
                    c='1';
                }
                else{
                   int lower=obj.lowerBound(temp, i[0]);
                   int upper=obj.upperBound(temp, i[1]);
                //    System.out.println("the lower b is "+lower+" the upper b is "+upper);
                //    upper--;
                   if(upper-lower<i[1]-i[0]+1)
                   {
                    c='1';
                   }
                }
                // System.out.print(c);
                ans.append(c);
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    public int upperBound(ArrayList<Integer> list, int value) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public int lowerBound(ArrayList<Integer> list, int value) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low; // or high (they're equal here)
    }
}
