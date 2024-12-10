import java.util.*;
public class CountCharArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //For Upper case
        String a=sc.nextLine();
        int c[]=new int[26];
        for (int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
        //For Lower case
        String a1=sc.nextLine();
        int c1[]=new int[26];
        for (int i=0;i<a1.length();i++)
        {
            c1[((int)(a1.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c1));
    }
}