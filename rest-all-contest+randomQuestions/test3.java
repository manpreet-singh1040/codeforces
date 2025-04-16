import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        int i = 0;
        while(i<t)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int n=m.nextInt();
            for(int j=0;j<n;j++)
            {
                int x=m.nextInt();
                temp.add(x);
            }
            arr.add(temp);
            i++;
        }
        i=0;
        while(i<t)
        {
            ArrayList<Integer> temp=new ArrayList<>(arr.get(i));
            HashSet<Integer> map=new HashSet<>();
            int sum=0;
            for(int j:temp)
            {
                sum=+sum+j;
            }
            int curs=sum;
            int max=0;
            int st=sum;
            sum=0;
            for(int j=0;j<temp.size();j++)
            {
                if(map.contains(temp.get(j)))
                {
                    if(max<temp.get(j))
                    {
                        max=temp.get(j);
                    }
                }
                else{
                    map.add(temp.get(i));
                }
                curs=curs-temp.get(j)+max;
                sum=sum+st;
                System.out.print(st+" ");
                st=curs;
            }
            //sum=sum+st;
            System.out.println(sum);
            i++;
        }
        i=0;
        m.close();
    }
}