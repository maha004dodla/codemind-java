import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        int n,m,i,j,sum=0;
        n=x.nextInt();
        m=x.nextInt();
        int a[][]=new int[n][m];
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                a[i][j]=x.nextInt();
            }
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
        
}

