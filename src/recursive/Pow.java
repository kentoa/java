
public class Pow {
	int pow(int x, int n){
		int ans = 1;
		
		while(0 < n){
			ans *= x;
			n--;
		}
		return ans;
	}
	
	int pow1(int x, int n){
		if(n == 0) return 1;
		else return x * pow1(x, n - 1);
	}
	
	int pow2(int x, int n){
		int ans = 1;
		
		if(n == 0) return 1;
		
		ans = pow2(x, n / 2);
		ans *= ans;
			
		if(n%2 == 1) ans *= x;
		return ans;
	}
	
	public static void main(String[] args){
		Pow p = new Pow();
		int ans;
		int x = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		ans = p.pow(x, n);
		System.out.println(ans);
		
		ans = p.pow1(x, n);
		System.out.println(ans);
		
		ans = p.pow2(x, n);
		System.out.println(ans);
	}
	
}
