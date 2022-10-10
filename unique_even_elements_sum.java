import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int i,j,n,sum=0;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            int flag=0,count=0;
            for(j=i+1; j<n; j++)
            {
                if(a[i]==a[j])
                {
                    flag=1;
                    count=1;
                }
            }
            if(flag==0 && count==0 && a[i]%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}