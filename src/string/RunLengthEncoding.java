
public class RunLengthEncoding {
	void run_length_encoding(String str){
		String ori = str, word; 
		String encode = "";
		
		int count = 0;
		String tmp = ori.substring(0, 1);
		for(int i = 0; i < str.length(); i++){
			word = ori.substring(i, i + 1);
			System.out.println(tmp + " " + word);
			if(word.equals(tmp)){
				count++;
			}
			else{
				encode += tmp;
				tmp = word;
				encode += String.valueOf(count);
				
				count = 1;
			}
		}
		System.out.println(encode);
	}
	
	public static void main(String[] args){
		RunLengthEncoding rle = new RunLengthEncoding();
		
		rle.run_length_encoding("aasd");
		
	}
}
