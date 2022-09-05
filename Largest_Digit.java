import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,ld=0,r;
        n=x.nextInt();
        while(n!=0)
        {
            r=n%10;
            if(ld<r)
            {
                ld=r;
            }
            n=n/10;
        }
        System.out.println(ld);
    }
}