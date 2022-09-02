import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        double a,b,i=1;
        a=x.nextInt();
        b=x.nextInt();
        while(a*i%b!=0)
        {
            i++;
        }
        System.out.format("%.0f",a*i);
    }
}