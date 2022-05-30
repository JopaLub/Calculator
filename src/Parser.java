public class Parser {
    public static boolean IsRome = false;
    public static int[] parser(String[] parts) throws Exception {
        int number1;
        int number2;
        try {
            number1 = Roman.valueOf(parts[0]).getValue();
            number2 = Roman.valueOf(parts[2]).getValue();
            IsRome = true;
        } catch (IllegalArgumentException e) {
            try {
                number1 = Integer.parseInt(parts[0]);
                number2 = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e2) {
                throw new Exception("Invalid data");
            }
        }
        if (number1 > 10 || number2 > 10 || number1 < 1 || number2 < 1){
            throw new Exception("Invalid data");
        }
        return new int[]{number1, number2};
    }
}
