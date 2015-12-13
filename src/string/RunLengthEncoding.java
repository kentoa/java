
public class RunLengthEncoding {
	void run_length_encoding(String str){
		String word, encode = "", tmp = str.substring(0, 1);		
		int count = 1;
		
		for(int i = 1; i < str.length(); i++){
			word = str.substring(i, i + 1);
			if(word.equals(tmp)){
				count++;
			}
			else{
				encode += tmp;
				tmp = word;
				if(count != 1) encode += String.valueOf(count);
				count = 1;
			}
			
			if(i == str.length() - 1){
				encode += word;
				if(count != 1) encode += String.valueOf(count);
			}
		}
		System.out.println(encode);
	}
	
	public static void main(String[] args){
		RunLengthEncoding rle = new RunLengthEncoding();
		rle.run_length_encoding("assddd");
	}
}
