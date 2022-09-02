import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        double p=x.nextDouble();
        double r=x.nextDouble();
        double t=x.nextDouble();
        double a,b,c;
        a=1+(r/100);
        b=Math.pow(a,t);
        c=p*b;
        System.out.format("%.2f",c);
        
        
    }
}