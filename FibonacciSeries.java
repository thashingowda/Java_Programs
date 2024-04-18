public class FibonacciSeries {
    public static void main(String[] args) {
        int firstnum=0;
        int secondnum=1;
        int thirdnum,n=10;
        System.out.println("Fibonacci Numbers upto "+n+" is");
        System.out.print(firstnum+" ");
        System.out.print(secondnum+" ");
        for (int i=2;i<=n;i++){

            thirdnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=thirdnum;
            System.out.print(thirdnum+" ");
        }



    }
}
