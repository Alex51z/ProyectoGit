import java.util.ArrayList;

public class Principal {

	public static void main (String [] args) {
		int va=0, ve=0, vi=0, vo=0, vu=0;
		String [] array= {"ANA", "LUIS", "ANTONIO", "MANUEL"};
		
		for (int i=0; i<array.length; i++) {
			for(int r=0; r<array[i].length();r++) {
				 if (array[i].charAt(r)=='a'){
					  va++;
				}else {
					if (array[i].charAt(r)=='e') {
						ve++;
					}else {
						if (array[i].charAt(r)=='i') {
							vi++;
						}else {
							if (array[i].charAt(r)=='o') {
								vo++;
							}else {
								if (array[i].charAt(r)=='u') {
									vu++;
								}
							}
						}
					}
				}
			}
		}
	}
}
