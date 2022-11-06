import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,m,o,i,c=0;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        m=x.nextInt();
        int b[]=new int[n];
        for(i=0; i<n; i++)
        {
            b[i]=x.nextInt();
        }
        o=x.nextInt();
        for(i=0; i<m; i++)
        {
            if(o>=a[i] && o<=b[i])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}