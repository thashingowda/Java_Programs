public class Printing_N_PrimeNumbers {
    public static  boolean isprime(int prime)
    {
        if(prime==0 || prime==1)
        {
            return false;
        }
        if(prime%2==0)
        {
            return false;
        }
        else
            return true;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("prime numbers are");
        for (int i=0;i<=n;i++)
        {
            if (isprime(i)) {

                System.out.print(i+" ");
        }
        }

        }
    }

