import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String a=x.nextLine();
        char b=x.next().charAt(0);
        int c=0,i,flag=0;
        for(i=0; i<a.length(); i++)
        {
            if(a.charAt(i)==b)
            {
                c++;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
        }
        else
        {
           System.out.println(c);
        }
        
    }
}