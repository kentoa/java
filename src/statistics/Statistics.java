
public class Statistics {
	double total(double[] data){
		double sum = 0;
		
		for(int i = 0; i < data.length; i++){
			sum += data[i];
		}
		
		return sum;
	}
	
	double mean(double[] data){
		return total(data) / data.length;
	}
	
	double variance(double[] data){
		double val = 0;
		double mean = mean(data);
		
		for(int i = 0; i < data.length; i++){
			val += Math.pow((data[i] - mean), 2);
		}
		return val / data.length;
	}
	
	double stddev(double[] data){
		return Math.sqrt(variance(data));
	}
	
	public static void main(String[] args){
		Statistics s = new Statistics();
	}
	
}
