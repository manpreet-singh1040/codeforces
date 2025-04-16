import java.util.*;

public class qe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> look=new ArrayList<>();
        for(int i=1;i<=500;i++){
            look.add( (i*(i+1))/2 );
        }
        while (t > 0) {
            int k = sc.nextInt();
            ArrayList<int []> arr=new ArrayList<>();
            int x=-100000000;
            int y=-100000000;
            int temp=k;
            int j=0;
            while(temp>0){
                int q=Collections.binarySearch(look, temp);
                if(q<0){
                    q=-q;
                    q-=2;
                }
                int p=look.get(q);
                // System.out.println("binary "+temp+" "+q);
                temp-=p;
                for(int kk=0;kk<q+2;kk++){
                    arr.add(new int[]{x,y});
                    x++;
                    j++;
                }
                y++;
            }
            if(k==0){
                System.out.println(1);
                System.out.println("0 0");
            }
            else{
                System.out.println(arr.size());

                for(int i[]:arr){
                    System.out.println(i[0]+" "+i[1]);
                }
            }
            t--;
        }
    }
}