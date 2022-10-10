import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String s=x.nextLine();
        int i,d=0,v=0,ws=0,c=0;
        for(i=0; i<s.length(); i++)
        {
            char ss=s.charAt(i);
            if(ss>='0' && ss<='9')
            {
                d++;
            }
            else if(ss=='a' ||ss=='e' ||ss=='i' ||ss=='o' ||ss=='u' ||ss=='A' ||ss=='E' ||ss=='I' ||ss=='O' ||ss=='U')
            {
                v++;
            }
            else if(ss==' ')
            {
                ws++;
            }
            else
            {
                c++;
            }
        }
        System.out.printf("Vowels: %d
",v);
        System.out.printf("Consonants: %d
",c);
        System.out.printf("Digits: %d
",d);
        System.out.printf("White spaces: %d
",ws);
    }
}