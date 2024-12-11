import java.util.*;
public class staticmethodwithprotectedAMwithoutvoidtype{
    protected static String s()
    {
        return "hello world";
    }
    public static void main(String args[]){
        String res=s();
        System.out.println(res);
    }
}