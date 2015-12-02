
public class Comb {

	int comb(int n, int r){ //再帰使わない
		int num = 1, denom = 1;
		
		for(int i = 0; i < r; i++){
			num *= (n - i);
			denom *= (i + 1);
		}
		return num /denom;
	}
	
	int comb2(int n, int r){ //再帰
		if(n == 0 || r == 0) return 1;
		return comb2(n, r - 1) * (n - r + 1) / r;
	}
	
	public static void main(String[] args){
		Comb c = new Comb();
		int n = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		
		int ans = c.comb(n, r);
		System.out.println(ans);
		ans = c.comb2(n, r);
		System.out.println(ans);
	}
}
