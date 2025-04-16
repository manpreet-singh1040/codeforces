import java.util.*;

public class qb {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            
            TreeMap<Integer,Integer> map=new TreeMap<>();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
                else map.put(arr[i],1);
            }
            String ans="YES";
            // // System.out.println("niik");
            // {
            //     int flag=0;
            //     int odd=0;
            //     for(Map.Entry<Integer, Integer> i: map.entrySet()){
            //         if(i.getValue()%2==1){
            //             flag=1;
            //             break;
            //         }
            //     }
            //     ArrayList<int []> temp=new ArrayList<>();
            //     if(flag==1){
            //         int tempPrev=-1;
            //         int prev=-1;
            //         int cur=0;
            //         for(Map.Entry<Integer,Integer> i:map.entrySet()){
            //             if(i.getValue()%2==0){
            //                 if(prev!=-1){
            //                     cur+=i.getValue();
            //                 }
            //                 else{
            //                     cur+=i.getValue();
            //                 }
            //             }
            //             else{
            //                 if(prev==-1){
            //                     {
            //                         prev=i.getKey();
            //                         cur+=i.getValue();
            //                     }
            //                 }
            //                 else{
            //                     int diff=i.getKey()-prev;
            //                     long minReq=(long)Math.pow(2,diff)+1;
            //                     // System.out.println(diff+" "+minReq+" "+cur);
            //                     if(cur>=minReq){
            //                         ans="YES";
            //                         cur=0;
            //                         prev=-1;
            //                     }
            //                     // else{
            //                     //     ans="NO";
            //                     //     break;
            //                     // }

            //                 }
            //             }
            //             tempPrev=i.getKey();
            //         }
            //     }
            //     else ans="YES";
            // }
            Arrays.sort(arr);
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i+=2){
                if(arr[i]==arr[i+1]){
                    if(temp.isEmpty()){
                        temp.add(arr[i]);
                    }
                    else{
                        if(temp.get(temp.size()-1)>=arr[i]){
                            temp.add(temp.get(temp.size()-1)+1);
                        }
                        else{
                            temp.add(arr[i]);
                        }
                    }
                }
                else{
                    if(temp.isEmpty()){
                        ans="NO";
                        break;
                    }
                    if(temp.get(temp.size()-1)+1<arr[i+1]){
                        ans="NO";
                        break;
                    }
                    temp.add(temp.get(temp.size()-1)+1);
                }
            }
            System.out.println(ans);
            t--;
        }
    }
    static long check(int arr[],int k){
        long ans=0;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if((i+1)%k==0){
                max=Math.max(max,cur);
                min=Math.min(min,cur);
                cur=0;
            }
        }
        ans=max-min;
        return ans;
    }
}