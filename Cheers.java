// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            word = word.toUpperCase();
            String nameout = ""; 
            int num = Integer.parseInt(args[1]);
            String vowles = "AEFHILMNORSX";
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                nameout = nameout + c;
                System.out.println("Give me " + ((vowles.indexOf(c) == -1) ? "a " : "an ") 
                + word.charAt(i) + ": " + word.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int j = 0; j < num; j++) {
                System.out.println(word + "!!!");
            }
        }
}
