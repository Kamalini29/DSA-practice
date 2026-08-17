package Basics.Math;

public class PalindromeNumber {
    public int rev(int n){
        if(n%10 == 0){
            return n;
        }
        int m=0;
        while(n > 0){
            m = m*10 + n%10;
            n = n/10; 
        }
        return m;
    }

    public boolean isPalindrome(int n){
        int m = rev(n);
        
        if(n == m){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        PalindromeNumber p = new PalindromeNumber();
        int n = 90909;
        int m = 90099;
        boolean n1 = p.isPalindrome(n);
        boolean m1 = p.isPalindrome(m);

        System.out.println("n is palindrome: "+ n1);
        System.out.println("m is palindrome: "+m1);
    }

}
