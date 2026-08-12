package Basics.Recursion;

public class Factorial{
    public int calc_factorial(int n){
        if (n==1) return 1;
        return n * calc_factorial(n-1);
    }

    public class Main{
        public static void main(String[] args) {
            Factorial f = new Factorial();
            System.out.println(f.calc_factorial(10));
            
        }
    }

}