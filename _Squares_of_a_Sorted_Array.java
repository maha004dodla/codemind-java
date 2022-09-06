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
            b[i]=a[i]*a[i];
        }
        Arrays.sort(b);
        for(i=0; i<n; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}

