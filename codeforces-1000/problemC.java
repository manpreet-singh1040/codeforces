import java.util.*;

public class problemC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {

           int n=sc.nextInt();
           int ind[]=new int[n];
           int maxv=0;
           int maxn=-1;
           ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
           for(int i=0;i<n;i++) adj.add(new ArrayList<>());
           Comparator<int []> com=(a,b)->{
               return b[1]-a[1];
            };
            for(int i=0;i<n-1;i++)
            {
                int x=sc.nextInt();
                x--;
                int y=sc.nextInt();
                y--;
                ind[x]++;
                ind[y]++;
                if(maxv<ind[x]){ maxv=ind[x]; maxn=x;}
                if(maxv<ind[y]){ maxv=ind[y]; maxn=y;}
                adj.get(x).add(y);
                adj.get(y).add(x);
            }
            if(n<=2){ System.out.println(0); t--; continue;}
            int ans=0;
            int qwe1=maxn;
            ans+=maxv;
            for(int i: adj.get(qwe1)){
                ind[i]--;
            }
            maxv=-1;
            maxn=-1;
            for(int i=0;i<n;i++)
            {
                if(maxv<ind[i] && i!=qwe1){
                    maxv=ind[i];
                    maxn=i;
                }
            }
            int qwe2=maxn;
            
                ans+=maxv;
                ans--;
            System.out.println(qwe1+" "+qwe2+" "+maxv);
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
    public static void dfs(TreeMap<Integer,ArrayList<Integer>> adj2,boolean [] visited,int cur){
        visited[cur]=true;
        for(int i=0;i<adj2.get(cur).size();i++)
        {
            if(!visited[adj2.get(cur).get(i)]){
                dfs(adj2,visited,adj2.get(cur).get(i));
            }
        }
    }
}
