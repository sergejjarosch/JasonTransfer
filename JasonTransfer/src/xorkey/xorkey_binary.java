package xorkey;

import java.util.ArrayList;
import java.util.Arrays;

public class xorkey_binary {

	public static void main(String[] args) {
		
		String nachricht ="GEHEIM";
		String key = "SAFETY";
		ArrayList<Integer> nachrichtBinary = new ArrayList<>();
		ArrayList<Integer> keyBinary = new ArrayList<>();
		ArrayList<Integer> xorComp = new ArrayList<>();

		
		System.out.println(convertToBinary(nachricht,nachrichtBinary ));
		System.out.println(convertToBinary(key,keyBinary ));
		
		
	

	}
	
    public static ArrayList<Integer> convertToBinary(String nachricht, ArrayList<Integer> arrayList) {
        for(int i = 0; i < nachricht.length(); i++) {
            int decimal = (int) nachricht.charAt(i); 
            String binaryString = Integer.toBinaryString(decimal); 
            int binary = Integer.parseInt(binaryString); 
            arrayList.add(binary); 
        }
        return arrayList; 
    }
    
}
