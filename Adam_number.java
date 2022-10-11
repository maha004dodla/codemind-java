import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int m,n,r1,r,sum=0,sum1=0,s1,s2;
        m=x.nextInt();
        n=m;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        s1=sum*sum;
        while(s1!=0)
        {
            r1=s1%10;
            s1=s1/10;
            sum1=(sum1*10)+r1;
        }
        s2=m*m;
        if(sum1==s2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}