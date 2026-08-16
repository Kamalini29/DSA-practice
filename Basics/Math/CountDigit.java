package Basics.Math;

public class CountDigit {
    public void digit(int a){
        int count =0;
        if(a==0){
            System.out.println(count + 1);
        }
        while(a > 0){
            a = a/10;
            count++;
        }

        System.out.println(count);        
    }

    public static void main(String[] args) {

        CountDigit c = new CountDigit();
    

        System.out.println(" number of digits : ");
        c.digit(1222) ;

    }
}
