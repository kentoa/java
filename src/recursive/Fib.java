
public class Fib {
	
	int fib(int n){ //2重再帰
		if(n == 0 || n == 1) return 1;
		else return fib(n - 1) + fib(n - 2);
	}
	
	int fib2(int n, int a1, int a2){ //末尾再帰
		if(n < 1) return a1;
		else return fib2(n - 1, a1 + a2, a1);
	}
	
	int fib3(int n){ //末尾再帰を繰り返しに変更
		int a1 = 1, a2 = 0;

		while(0 < n){
			a1 = a1 + a2;
			a2 = a1;
			n--;
		}
		return a1;
	}
	
	public static void main(String[] args)throws Exception{
		Fib f = new Fib();
		int n = Integer.parseInt(args[0]);
		
		int ans = f.fib(n);
		System.out.println(ans);
		
		int ans2 = f.fib2(n, 1, 0);
		System.out.println(ans2);
		
		int ans3 = f.fib2(n, 1, 0);
		System.out.println(ans3);
		
	}
	
}
