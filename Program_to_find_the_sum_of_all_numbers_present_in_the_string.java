import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        int i,sum=0;
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                sum=sum+(s.charAt(i)-'0');
            }
        }
        System.out.println(sum);
    }
}