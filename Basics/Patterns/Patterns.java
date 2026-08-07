package Basics.Patterns;

public class Patterns {
	public class pattern14 {
      public void pattern14(int n) {
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int bottom = size - 1 - i;
                int left = j;
                int right = size - 1 - j;
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }
}

	public class pattern13 {
      public void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

	public class pattern12 {
		public void pattern12(int n) {
			for (int i = 0; i < n; i++) {

				// Spaces
				for (int j = 0; j < n - i - 1; j++) {
					System.out.print(" ");
				}

				// Increasing letters
				for (char ch = 'A'; ch <= 'A' + i; ch++) {
					System.out.print(ch);
				}

				// Decreasing letters
				for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
					System.out.print(ch);
				}

				System.out.println();
			}
		}
}
	public class pattern11 {
		public void pattern11(int n) {
			for (int i = 1; i <= n; i++) {
				char ch = (char) ('A' + i - 1);

				for (int j = 1; j <= i; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
}
	public class pattern10 {
    	public void pattern10(int n) {
			for (int i = n; i >= 1; i--) {
				for (char ch = 'A'; ch < 'A' + i; ch++) {
					System.out.print(ch);
				}
				System.out.println();
			}
    }
}
	public class pattern9 {
		public void pattern9(int n) {
			for (int i = 1; i <= n; i++) {
				for (char ch = 'A'; ch < 'A' + i; ch++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
}
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
		pattern9 p9 = obj.new pattern9();
		pattern10 p10 = obj.new pattern10();
		pattern11 p11 = obj.new pattern11();
		pattern12 p12 = obj.new pattern12();
		pattern13 p13 = obj.new pattern13();
		pattern14 p14 = obj.new pattern14();
	    
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
	    System.out.println();
		p9.pattern9(5);

		System.out.println();
		p10.pattern10(5);

		System.out.println();
		p11.pattern11(5);

		System.out.println();
		p12.pattern12(5);

		System.out.println();
		p13.pattern13(5);
		System.out.println();
		p14.pattern14(5);
		
	}
	
	
	
}

