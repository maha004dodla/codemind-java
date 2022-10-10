import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        String ss="";
        for(int i=0; i<s.length(); i++)
        {
           ss=s.charAt(i)+ss; 
        }
        System.out.println(ss);
    }
}