public class AmstrongNumberOrNot {
    public static void main(String[] args) {
        int n=153;
        int amstrong=0,temp,original=n;
        while (n>0)
        {
            temp=n%10;
            temp= (int) Math.pow(temp,3); //int bcz math defaultly write in double value we are storing that value in int datatype
            amstrong=amstrong+temp;
            n=n/10;
        }
        if(amstrong==original)
        {
            System.out.println("it is");
        }
        else {
            System.out.println("not amstrong");
        }
    }
}
