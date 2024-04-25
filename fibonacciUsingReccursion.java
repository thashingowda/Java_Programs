public class fibonacciUsingReccursion {
    public static int fibreccusrsion(int count)
    {
        if(count==0) {
            return 0;
        }
        if(count==1 || count==2) {
            return 1;
        }

        return (count-1)+(count-2);
    }
    public static void main(String[] args) {
        int fiblength=9;
        for (int i=0;i<=fiblength;i++)
        {
            System.out.print(fibreccusrsion(i)+" ");
        }
    }

}
