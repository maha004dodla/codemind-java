import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a,i,j,fac=1;
        for(i=0; i<n; i++)
        {
            fac=1;
            a=x.nextInt();
            for(j=2; j<=a; j++)
            {
                fac=fac*j;
            }
            System.out.println(fac);
        }
        
    }
}