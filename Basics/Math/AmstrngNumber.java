package Basics.Math;

public class AmstrngNumber {
    public boolean isAmstrong(int n){
        int sum =0;
        int n_rec = n;

        while(n>0){
            int digit = n%10;
            sum = sum+ digit*digit*digit;
            n= n/10;
        }
        if(sum == n_rec){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        AmstrngNumber a = new AmstrngNumber();
        boolean b = a.isAmstrong(153);

        System.out.println("is amstring: " + b);
    }
    
}
