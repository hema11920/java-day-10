import java.util.*;
public class staticmethodwithpublicAMwithoutvoidtype{
    public static String s()
    {
        return "hello world";
    }
    public static void main(String args[]){
        String res=s();
        System.out.println(res);
    }
}