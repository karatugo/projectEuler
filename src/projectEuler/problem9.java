package projectEuler;

public class problem9 {
	public static void main(String[] args) {
		
		
		int N = 1000;
		
		findTriples(N);
	}

	public static void findTriples(int N) {
		double c_sq = 0;
		for (int a = 3; a<N; a++) {
			for (int b = a; b < N; b++) {
				c_sq = a*a + b*b;
				double c = Math.sqrt(c_sq);
				if (Math.floor(c) == Math.ceil(c) && a+b+c == N) {
					int mult = (int) (a*b*c);
					System.out.println(a + " ; "+ b + " ; "+ c + " ; " + mult);
				}
			}
		}
	}

	
}
