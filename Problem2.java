
public class Problem2 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,7,7,8,8,10};
		int target = 6;
		
		
		String output = "[";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				output=output+""+i+",";
		}
		
		if(output.length()==1)
			output = "[-1,-1]";
		else {
		output = output.substring(0, output.length()-1);
		output = output + "]";
		}
		
		System.out.println("Sample Output: "+output);
		
	}

}
