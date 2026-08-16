package Basics.Math;

public class ReverseDigit {

    public int reverse(int a, int b){
        
        if(a==0){

            return b;
        }

        b = b*10 + a%10;
        a = a/10;


        return reverse(a, b);


    }

    public static void main(String[] args) {

        ReverseDigit c = new ReverseDigit();
        int a = 998877;
        int b = 0;

        int reverse = c.reverse(a, b);

        System.out.println(" number of digits : ");
        System.out.println(reverse +"  ");

    }
}
