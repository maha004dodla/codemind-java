import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        int a0,a1,a2,b0,b1,b2,a=0,b=0;
        a0=x.nextInt();
        a1=x.nextInt();
        a2=x.nextInt();
        b0=x.nextInt();
        b1=x.nextInt();
        b2=x.nextInt();
        if(a0>b0)
    {
        a++;
    }
    else if(b0>a0)
    {
        b++;
    }
    if(a1>b1)
    {
        a++;
    }
    else if(b1>a1)
    {
        b++;
    }
    if(a2>b2)
    {
        a++;
    }
    else if(b2>a2)
    {
        b++;
    }
    System.out.print(a+" "+b);
    }
}

