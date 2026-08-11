package Basics.Recursion;

public class PrintSumofN{
    public int sumofN(int n){
        if(n==0){
            return 0;
        }
        return n + sumofN(n-1);
    }
    class Main{
        public static void main(String[] args) {
            PrintSumofN p = new PrintSumofN();
            System.out.println(p.sumofN(10));
        }
    }
}