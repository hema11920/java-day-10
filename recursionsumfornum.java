import java.util.*;
public class recursionsumfornum{
    int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        recursionsumfornum ob=new recursionsumfornum();
        int res=ob.sum(10);
        System.out.println(res);
    }
}