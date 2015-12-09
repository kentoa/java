import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;

public class SuffixArray {
	
	ArrayList<Integer> suffixArrayGen(String str){
		TreeMap<String, Integer> suffix = new TreeMap<>();
		String register = str, key;
		
		for(int i = 0; i < str.length(); i++){
			key = register.substring(i, str.length());
			suffix.put(key, i);
			register = str;
			System.out.println(i + ", " + key);
		}
		
		System.out.println("---sort---");
		
		ArrayList<Integer> suffix_array = new ArrayList<>();
		Iterator<String> iter = suffix.keySet().iterator();
		
	        while(iter.hasNext()){
	            String keyval = iter.next();
	            System.out.println(keyval + ", " + suffix.get(keyval));
	            suffix_array.add(suffix.get(keyval));
	        }
		
		return suffix_array;
	}
	
	void print(ArrayList<Integer> suffix_array){
		System.out.println("---suffix array---");
		for(int i = 0; i < suffix_array.size(); i++){
			System.out.print(suffix_array.get(i));
			if(i != suffix_array.size() - 1) System.out.print(", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		SuffixArray sa = new SuffixArray();
		ArrayList<Integer> result = sa.suffixArrayGen("aeadacab");
		sa.print(result);
	}
	
}
