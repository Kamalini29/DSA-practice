package Basics.Recursion;

public class PrintNTimes{
    public void PrintN(String s,int c, int n){
        if(c==n){
            return;
        }

        System.out.println(s);
        c++;
        PrintN(s,c, n);

    }
    
    public class Main{
        public  static void main(String[] args){
            PrintNTimes p = new PrintNTimes();
            p.PrintN("Kam", 0, 5);
    }
}
}
