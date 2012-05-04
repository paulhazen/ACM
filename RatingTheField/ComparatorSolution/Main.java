import com.acm.helper.*;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	
	}

	class MeatMarket implements Comparator<String> {
		public int compare(String man1, String man2) {
			String[] manParts1 = man1.split("[ \t]+");
			String[] marParts2 = man2.split("[ \t]+");
			
			int h1 = Math.abs(Integer.parseInt(manParts1[2]) - 180);
			int h2 = Math.abs(Integer.parseInt(manParts2[2]) - 180);
			
			if(h1 != h2) {
				return h1-h2;
			}		
		}
	}
}
