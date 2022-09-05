import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a,b,c;
        a=0;
        b=1;
        c=a+b;
        while(c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}