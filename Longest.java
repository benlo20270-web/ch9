import java.util.Arrays;
public class Longest {
    public static void main(String[] args) {
      if (args.length == 0) {
      System.err.println("Error");
  }
		
		int snum = 0;
		String firstALPH = args[0];

for (int i = 0; i < args.length; i++) {
	
	if (args[i].length() > args[snum].length()) {
		snum = i;
}
	if (args[i].compareTo(firstALPH) < 0) {
	firstALPH = args[i];
}


	
}
int lengh = args[snum].length();
System.out.println("Longest: " + args[snum] + "(" + lengh + "letters)");
System.out.println("First Alphabetically: " + firstALPH);
	
}
}

