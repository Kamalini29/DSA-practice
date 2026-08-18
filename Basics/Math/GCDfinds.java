package Basics.Math;


public class GCDfinds {
    public int gcdOfNums(int a, int b){
        int gcd =1;
        for(int i =1; i<= Math.min(a, b);i++){

            if(a%i == 0 && b%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
    
    public static void main(String[] args) {
        GCDfinds g = new GCDfinds();
        int a = 900;
        int b = 18;
        int gcd = g.gcdOfNums(a, b);
        System.out.println(gcd);

    }
}
