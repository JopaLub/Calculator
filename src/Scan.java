import java.util.Scanner;

public class Scan {
        public static String[] read() throws Exception {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String[] parts = input.split(" ");// подумать над сплитером
            if (parts.length > 3) {
                throw new Exception("More than two numbers");
            }
            return parts;
        }
}
