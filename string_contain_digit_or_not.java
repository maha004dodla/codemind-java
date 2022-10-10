//string contains digit or not
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        int j,c=0;
        for(j=0; j<s.length(); j++)
        {
            if(s.charAt(j)>='0' && s.charAt(j)<='9')
            {
                c++;
            }
        }
        if(c>1)
        {
          System.out.printf("Contains %d digit",c);
        }
        else
        {
            System.out.printf("Doesn't contain digit");
        }
        
    }
}