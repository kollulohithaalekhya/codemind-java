import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner read= new Scanner(System.in);
        int a;
        a=read.nextInt();
        int c=a/60;
        int d=a%60;
        System.out.println(c+" Hour(s) "+d+" Minute(s)" );
    }
}