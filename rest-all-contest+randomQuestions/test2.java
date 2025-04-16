import java.util.*;

public class test2 {
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
        String ans[]=new String[t];
        while(i<t)
        {
            Collections.sort(arr.get(i));
            String f="YES";
            int count=1;
            for(int j=arr.get(i).size()-2;j>=0;j--)
            {
                if(arr.get(i).get(j)==arr.get(i).get(j+1))
                {
                    count++;
                }
                else{
                    if(count%2==0)
                    {
                        f="NO";
                    }
                    else{
                        f="YES";
                        break;
                    }
                    count=1;
                }
            }
            if(count%2==0)
            {
                f="NO";
            }
            else{
                f="YES";
            }
            ans[i]=f;
            i++;
        }
        i=0;
        while(i<t)
        {
           
                
            System.out.println(ans[i]);
            i++;
        }
        m.close();
    }
}