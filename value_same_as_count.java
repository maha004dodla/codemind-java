import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,j,c=0,count=0;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
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
            if(a[i]==c)
            {
                count++;
                a[i]=-1;
            }
        }
        System.out.println(count);
        
    }
}