import java.util.*;

public class sip
{
    public static void main(String args[])
    {
        double p,r,t;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle: ");
        p = sc.nextInt();

        System.out.println("Enter rate of interest: ");
        r = sc.nextInt();

        System.out.println("Enter period of time: ");
        t = sc.nextInt();

        double si = (p*t*r)/100;

        System.out.println("Principle is: "+p);
        System.out.println("Rate of interest is: "+r);
        System.out.println("period of time is: "+t);
        System.out.println("Simple Interest is: "+si);
    }
}
