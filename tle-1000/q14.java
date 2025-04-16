import java.util.*;

public class q14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            // int k=sc.nextInt();
            int arr[]=new int[n];
            int ans[]=new int[n];
            TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i])) map.get(arr[i]).add(i);
                else{
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    map.put(arr[i],temp);
                }
            }
            int flag=0;
            for(Map.Entry<Integer,ArrayList<Integer>> i:map.entrySet()){
                if(i.getValue().size()==1){
                    flag=1;
                    break;
                }
                else{
                    // System.out.println("the debugger -->");
                    // for(int j:i.getValue()){
                    //     System.out.print(j+" ");
                    // }
                    // System.out.println();
                    Collections.reverse(i.getValue());
                    int temp=i.getValue().get(0);
                    i.getValue().add(temp);
                    i.getValue().remove(0);
                    // for(int j:i.getValue()){
                    //     System.out.print(j+" ");
                    // }
                    // System.out.println();
                }
            }
            if(flag==1){

                System.out.println(-1);
                t--;
                continue;
            }
            // ans[0]=n;
            for(int i=0;i<n;i++){
                ans[i]=map.get(arr[i]).get(map.get(arr[i]).size()-1);
                map.get(arr[i]).remove(map.get(arr[i]).size()-1);
            }
            for(int i: ans){
                System.out.print((i+1)+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}