import java.lang.*;

public class CheckPermutation{

	static boolean isPermutation(String s1, String s2){

		if(s1.length()!=s2.length()){
			return false;
		}
		else{

			int arr[]=new int[256];
			for(int i=0;i<s1.length();i++){
				arr[s1.charAt(i)]++;
			}
			for(int i=0;i<s2.length();i++){
				arr[s2.charAt(i)]--;
				if(arr[s2.charAt(i)]<0)
					return false;
			}
		}
		return true;
	}

	public static void main(String args[]){


		String s1="azcd";
		String s2="cabd";
		System.out.println(isPermutation(s1,s2));
	}
}