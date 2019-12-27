package test;
/*斐波那契数列，递归，循环*/

public class test10 {
	
	public static int Fibonacci1(int i) {
		if(i<=0) {
			return 0;
		}
		else if(i==1) {
			return 1;
		}else {
			return Fibonacci1(i-1)+Fibonacci1(i-2);
		}
	}

	public static int Fibonacci2(int i) {
		if(i<=0) {
			return 0;
		}
		else if(i==1) {
			return 1;
		}else {
			int one = 1;
			int two = 0;
			int temp = 0;
			for(int n=2;n<=i;++n) {
				temp = one + two;
				two = one;
				one = temp;
			}
		return temp;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci1(6));
		System.out.println(Fibonacci2(6));
	}

}
