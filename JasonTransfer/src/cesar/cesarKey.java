package cesar;

public class cesarKey {

	public static void main(String[] args) {
		
		StringBuilder stringText = new StringBuilder();
		StringBuilder codezurText = new StringBuilder();
		
		System.out.print("Gib hier dein Text ein: ");
		String text = new java.util.Scanner(System.in).nextLine();
		System.out.print("Wie weit soll ich es verschieben?: ");
		int shift = new java.util.Scanner(System.in).nextInt();;
		
		
		for(int i = 0; i < text.length(); i++) {
			char buchstabe = text.charAt(i);
			int zahlBuchstabe = (int) buchstabe + shift;
			char BuchstabeVonZahl = (char) zahlBuchstabe;		
			stringText.append(BuchstabeVonZahl);
		}
		
		String zusammengesetzt = stringText.toString();
		System.out.println("\n" + zusammengesetzt + "\n");
		
		// - - - - - -  decodieren  - - - - - -
		
		for(int i = 0; i < zusammengesetzt.length(); i++) {
			char buchstabe = zusammengesetzt.charAt(i);
			int zahlBuchstabe = (int) buchstabe - shift;
			char BuchstabeVonZahl = (char) zahlBuchstabe;		
			codezurText.append(BuchstabeVonZahl);
		}
		
	
		System.out.println(codezurText + "\n");

	
	}
	public static void codieren() {
		
	}
}
