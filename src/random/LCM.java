
public class LCM { //線形合同法(Linear Congruential Method)

	int[] rand1(int seed, int A, int C, int M){ //周期M
		int[] X = new int[M];
		
		X[0] = seed;
		System.out.println(X[0]);
		for(int i = 1; i < M; i++){
			X[i] = (A *X[i - 1]  + C) % M; //X[n] = (A*X[n-1] + C) mod M
			System.out.println(X[i]);
		}
		return X;
	}
	
	int[] rand2(int seed, int A, int C, int M){ //周期M/4
		int[] X = new int[M];
		
		X[0] = seed;
		System.out.println(X[0]);
		for(int i = 1; i < M; i++){
			X[i] = (A *X[i - 1]) % M; //X[n] = (A*X[n-1]) mod M
			System.out.println(X[i]);
		}
		return X;
	}
	
	public static void main(String[] args){
		LCM lcm = new LCM();
		lcm.rand1(1, 13, 1, 16);
		System.out.println();
		lcm.rand2(1, 13, 1, 16);
	}
	
}
