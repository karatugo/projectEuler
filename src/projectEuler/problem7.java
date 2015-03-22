package projectEuler;

public class problem7 {
	public static void main(String[] args) {
		
		
		int N = 10001;
		
		System.out.println(findPrimes(N));
	}
	
	//this method finds Nth prime number
	public static int findPrimes(int N) {
		
		int counter = 1;
		int i = 2;
		
		while(counter < N+1) {
			
			if (isPrime(i)){
				if (counter == N) {
					System.out.println(counter + " : " + i);
				}			
				counter++;
			}
			i++;
		}		
		return counter;
	}
	
	//this method check if a given integer is prime
	public static boolean isPrime(int p) {
		
		boolean check = false;
		
		if (p==2) {
			check = true;
		} else {			
			for (int j=2; j < p; j++) {
				
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
