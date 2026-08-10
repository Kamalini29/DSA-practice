package Basics.Recursion;

public class Print1toN{
    public void print1toN(int n,int c){
        if((n+1) == c) return;
        System.out.println(c);
        c++;
        print1toN(n, c);

    }
    public class Main{
        public  static void main(String[] args){
            Print1toN p = new Print1toN();
            p.print1toN(5, 1);
    }
}


}

