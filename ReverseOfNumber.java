import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int num1=num;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit; //3
            num=num/10;
        }
        System.out.println("reverse of "+num1+" is "+rev);
if(num1==rev)
    System.out.println("palindrom");
else{
    System.out.println("not palindrome");
}
    }
}
