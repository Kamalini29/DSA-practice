package Basics.Recursion;

public class PrintNto1 {
     public void printNto1(int n){
        if((n) == 0)return;
        System.out.println(n);
        printNto1(n-1);

    }
    public class Main{
        public  static void main(String[] args){
            PrintNto1 p = new PrintNto1();
            p.printNto1(5);
    }
}
    
}
