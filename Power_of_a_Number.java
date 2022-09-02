import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        double a,b,c,d,e;
        a=x.nextInt();
        b=x.nextInt();
        c=x.nextInt();
        d=Math.pow(a,b);
        e=d%c;
        System.out.format("%.0f",e);
    }
}