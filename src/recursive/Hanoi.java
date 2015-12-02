
public class Hanoi {
	
	void hanoi(int n, String from, String to, String via){
		if(n == 1){
			System.out.println(from + " -> " + to);
		}
		else{
			hanoi(n - 1, from, via, to);
			System.out.println(from + " -> " + to);
			hanoi(n - 1, via, to, from);
		}
	}
	
	public static void main(String[] args){
		Hanoi h = new Hanoi();
		int n = Integer.parseInt(args[0]);
		
		System.out.println("hanoi(" + n + ", a, b, c)");
		h.hanoi(n, "a", "b", "c");
	}
}
