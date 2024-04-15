public class ArmstrongNumber1To2000 {
    public static boolean armstrong(int num) {
        int original = num;
        int arms = 0;
        int numberOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            int cal = (int) Math.pow(digit, numberOfDigits);
            arms = arms + cal;
            num=num/10;
        }
        return original==arms;
    }

    public static void main(String[] args) {
        for (int i=0;i<=2000;i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }

    }
}
