import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        String a=x.nextLine();
        String b=x.nextLine();
        String str=a+b;
        char array[] = str.toCharArray();
        Arrays.sort(array);
        String s=new String(array);
        System.out.println(s);

    }
}

