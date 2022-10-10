import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        int i,d=0,v=0,ws=0,c=0;
        for(i=0; i<s.length(); i++)
        {
            char ss=s.charAt(i);
            if(ss==' ')
            {
                ws++;
            }
        }
        System.out.println(ws+1);
    }
}