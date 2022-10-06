import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,i,b=0,c=0;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            b=(int)(Math.log10(a[i])+1);;
            if(b%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}