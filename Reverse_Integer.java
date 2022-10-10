import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int m=x.nextInt();
        int r,sum=0,n=m;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        System.out.println(sum);
    }
}