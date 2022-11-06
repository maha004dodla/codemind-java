import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m=x.nextInt();
        int a[]=new int[n];
        int i,j,c=0;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(a[i]>=m)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}