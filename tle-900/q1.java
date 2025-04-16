import java.util.*;

public class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int ans=0;
            long a=sc.nextLong();
            long b=sc.nextLong();
            long x1=sc.nextLong();
            long y1=sc.nextLong();
            long x2=sc.nextLong();
            long y2=sc.nextLong();
            HashMap<List<Long>,Integer> set=new HashMap<>();
            sol(set,x1,y1,a,b,0);
            // display(set);
            List<Long> tempList=new ArrayList<>();
            tempList.add(x2);
            tempList.add(y2);
            if(set.containsKey(tempList)){
                ans=(set.get(tempList)/2)%2==1 ? 1: 2;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static void sol(HashMap<List<Long>,Integer> set,long x1,long y1,long a,long b,int x){
        if(x==2){

            List<Long> tempList=new ArrayList<>();
                tempList.add(x1);
                tempList.add(y1);
                if(set.containsKey(tempList)) set.put(tempList,set.get(tempList)+1);
                else set.put(tempList,1);
        }
       if(x<2){
           x++;
        sol(set,x1+a,y1+b,a,b,x);
        sol(set,x1-a,y1+b,a,b,x);
        sol(set,x1+a,y1-b,a,b,x);
        sol(set,x1-a,y1-b,a,b,x);

        sol(set,x1+b,y1+a,a,b,x);
        sol(set,x1-b,y1+a,a,b,x);
        sol(set,x1+b,y1-a,a,b,x);
        sol(set,x1-b,y1-a,a,b,x);
        
       }
    }
    static void display(HashMap<List<Long>,Integer> map){
        for(Map.Entry<List<Long>, Integer> i:map.entrySet()){
            
            System.out.println(i.getKey().get(0)+" "+i.getKey().get(1));
        }
        System.out.println(map.size());
    }
 }