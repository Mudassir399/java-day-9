import java.util.*;
public class TogglingOfString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        String ans=" ";
        s^=32;
        System.out.println(s);
    }
}