import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        int m=x.nextInt();
        int b[]=new int[m];
        for(int i=0; i<n; i++)
        {
            b[i]=x.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int k,c=0;
        for(k=0; k<m; k++)
        {
            if(a[k]==b[k])
            {
                c++;
            }
        }
        if(c==m)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}