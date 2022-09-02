import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        float sum=0,i;
        for(i=1; i<=n; i++)
        {
            sum=sum+(1/i);
        }
        System.out.format("%.2f",sum);
    }
}