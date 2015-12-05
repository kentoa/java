import java.util.ArrayList;

public class SuffixArray { //作り途中
	
	ArrayList<String> suffixArrayGen(String str){
		ArrayList<String[]> list = new ArrayList<>();
		ArrayList<String> suffix = new ArrayList<>(); 
		String register = str;
		
		for(int i = 0; i < str.length(); i++){
			String[] pair = {String.valueOf(i), register.substring(0, str.length() - i)};
			list.add(pair);
			register = str;
		}
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i)[0] + ", " + list.get(i)[1]);
		}
		
		//do sort
		return suffix;
	}
	
	
	public static void main(String[] args){
		SuffixArray sa = new SuffixArray();
		
		sa.suffixArrayGen("asdfg");
		
	}
	
}
