import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,ec=0,oc=0;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                ec++;
            }
            else
            {
                oc++;
            }
        }
        System.out.print(ec+" "+oc);
    }
}