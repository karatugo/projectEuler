package projectEuler;

public class problem4 {
	public static void main(String[] args) {
		
		int N = 1000000;
		
		System.out.println(findPrimes(N));
	}
	
	//this method finds prime numbers up to given N
	public static int findPrimes(int N) {
		
		int counter = 0;
		
		for (int i=2; i < N; i++) {
			if (isPrime(i)){
				//System.out.println(i);
				counter = i+counter;
			}
		}
		
		return counter;
	}
	
	//this method check if a given integer is prime
	public static boolean isPrime(int p) {
		
		boolean check = false;
		
		if (p==2) {
			check = true;
		} else {			
			for (int j=2; j < p+1/2; j++) {
				
				if (p %j == 0) {
					check = false;
					break;
				} else {
					check = true;
				}
			}
		}
		return check;
	}

}
