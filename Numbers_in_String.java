//string contains digit or not
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        int j,sum=0;
        for(j=0; j<s.length(); j++)
        {
            if(s.charAt(j)>='0' && s.charAt(j)<='9')
            {
                sum=sum+(s.charAt(j)-'0');
            }
        }
        System.out.println(sum);
        
    }
}