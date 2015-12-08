import java.util.HashMap;
import java.util.Map;

public class Entropy {
	void calc_entropy(String str){
		Map<String, Integer> chMap = new HashMap<>();
		int count;
		double entropy;
		
		String ori = str;
	
		for(int i = 0; i < str.length(); i++){ //count occurrence for each characters
			String ch = ori.substring(i, i + 1);
			if(chMap.containsKey(ch)){
				count = chMap.get(ch);
				chMap.put(ch, ++count);
			}
			else{
				chMap.put(ch, 1);
			}
		}
		
		int num = chMap.size();
		String[] ch = new String[num]; 
		double[] px = new double[num];
		count = -1;
		
		for(Map.Entry<String, Integer> e: chMap.entrySet()){
			count++;
			System.out.println(e.getKey() + ", " + e.getValue()); //show frequency for each characters
			px[count] = e.getValue() / (double)num;
			ch[count] = e.getKey();
		}
		
		for(int i = 0; i < num; i++){
			entropy = -px[i] * Math.log(px[i]); //calculate entropy
			System.out.println("<key, entoropy> = <" +ch[i] +  ", " + entropy + ">");
		}
	}
	
	public static void main(String[] args) {
		Entropy e = new Entropy();
		e.calc_entropy(args[0]);
	}
}