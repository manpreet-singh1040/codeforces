import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

public class problemA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        //    int n=sc.nextInt();
        //    
        int l=sc.nextInt();
        int r=sc.nextInt();
        if(l==r){
            if(l==1) System.out.println("1");
            else System.out.println("0");
        }
        else{
            if(l==1) System.out.println(r-1);
            else System.out.println(r-l);
        }
            t--;
        }
        sc.close();
    }
}
