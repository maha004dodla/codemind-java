import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        int n,m,i;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        int b[]=new int[n];
        for(i=0; i<n; i++)
        {
            b[i]=x.nextInt();
        }
        int c[]=new int[n];
        for(i=0; i<n; i++)
        {
            c[i]=a[i]+b[i];
            System.out.print(c[i]+" ");
        }
    }
        
}

