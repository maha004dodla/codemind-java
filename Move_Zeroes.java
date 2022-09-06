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
        for(i=0; i<n; i++)
        {
            if(a[i]!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(i=0; i<n; i++)
        {
            if(a[i]==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        
    }
        
}

