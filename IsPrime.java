package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		boolean prime = true;
		
		for (int i = 2; i < n; i++) {
			
			if(n%i == 0) {
				prime = false;
				break;
			}
		}
		if (prime)
			System.out.println("Is a prime number");
		else
			System.out.println("Is not a prime number");
	}

}
