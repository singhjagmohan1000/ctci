import java.lang.*;


public class UniqueString{

	static boolean isUnique(String s){
		boolean arr[]= new boolean[256];

		for(int i=0;i<s.length();i++){

			if(arr[s.charAt(i)]==true)
				return false;
			arr[s.charAt(i)]=true;
		}

		return true;
	}

	public static void main(String args[]){

		String str="abce";
		System.out.println(isUnique(str));

	}
}