import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int a,b,i,hcf=0;
        a=x.nextInt();
        b=x.nextInt();
        for(i=1; i<=b; i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println(hcf);
        
    }
}