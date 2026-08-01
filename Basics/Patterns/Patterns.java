package Basics.Patterns;

public class Patterns {
	public class pattern8 {
		public void pattern8(int n) {

			int spaces = 2 * (n - 1);

			for (int i = 1; i <= n; i++) {

				// Left numbers
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}

				// Spaces
				for (int j = 1; j <= spaces; j++) {
					System.out.print(" ");
				}

				// Right numbers
				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				}

				System.out.println();

				spaces -= 2;
			}
		}
	}
	public class pattern7 {
		public void pattern7(int n) {

			for (int i = 0; i < n; i++) {

				int start;

				if (i % 2 == 0)
					start = 1;
				else
					start = 0;

				for (int j = 0; j <= i; j++) {
					System.out.print(start + " ");
					start = 1 - start;   // Toggle between 1 and 0
				}

				System.out.println();
			}
		}
	}
	public class pattern6{
		public void pattern6(int n) {
			for (int i =0; i<2*n;i++) {
				if(i<n) {
					for(int j=1;j<n-i;j++) {
						System.out.print(" ");
					}
					for(int j =0; j<(2*i)+1;j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
				else {
					for(int j=1;j<i-n+1;j++) {
						System.out.print(" ");
					}
					for(int j =0 ; j<2*(2*n -i) - 1 ; j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
			}
		}
	}
	public class pattern5{
		public void pattern5(int n) {
			//outer loop
			for(int i =0; i<n;i++) {
				//inner loop -3
				//space
				for(int j =0; j<i; j++) {
					System.out.print(" ");
				}
				//star
				for(int j =0; j<(2*n) - (2*i+1); j++) {
					System.out.print("*");
				}
				//space again
				for(int j =0; j<i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	public class pattern4{
		public void pattern4(int n) {
			//outer loop
			for(int i =0; i<n;i++) {
				//inner loop -3
				//space
				for(int j =1; j<n-i; j++) {
					System.out.print(" ");
				}
				//star
				for(int j =0; j<2*i+1; j++) {
					System.out.print("*");
				}
				//space again
				for(int j =1; j<n-i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	
	public class pattern3 {
		public void pattern3(int n) {
	        for(int i=n; i>0;i--){
	            for(int j =i;j<n;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}
	public class pattern2 {
		public void pattern2(int n) {
	        for(int i=0; i<n;i++){
	            for(int j =i;j<n;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}
	
	public class pattern1 {
		public void pattern1(int n) {
	        for(int i=0; i<n;i++){
	            for(int j =0;j<n;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}
	public static void main(String[] args) {
	    Patterns obj = new Patterns();
	    
	    pattern1 p1 = obj.new pattern1();
	    pattern2 p2 = obj.new pattern2();
	    pattern3 p3 = obj.new pattern3();
	    pattern4 p4 = obj.new pattern4();
	    pattern5 p5 = obj.new pattern5();
	    pattern6 p6 = obj.new pattern6();
		pattern7 p7 = obj.new pattern7();
		pattern8 p8 = obj.new pattern8();
	    
	    p1.pattern1(5);
	    System.out.println();
	    p2.pattern2(5);
	    System.out.println();
	    p3.pattern3(5);
	    System.out.println();
	    p4.pattern4(5);
	    System.out.println();
	    p5.pattern5(5);
	    System.out.println();
	    p6.pattern6(5);
		System.out.println();
	    p7.pattern7(5);
		System.out.println();
	    p8.pattern8(5);
	    
	}
	
	
	
}

