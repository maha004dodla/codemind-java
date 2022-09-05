import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,j,c=0,count=0,flag=0;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        int k=x.nextInt();
        for(i=0; i<n; i++)
        {
            c=0;
            for(j=0; j<n; j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==k)
            {
                flag=1;
                System.out.print(a[i]+" ");
                a[i]=-1;
            }
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
        
    }
}