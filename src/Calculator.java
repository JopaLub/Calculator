public class Calculator {
    public static void main(String[] args) throws Exception {
        String[] parts = Scan.read();
        int[] numbers = Parser.parser(parts);
        char operation = parts[1].charAt(0);
        int result = Calculate.calc(numbers[0], numbers[1], operation);
        if (Parser.IsRome){
            System.out.println(Conv.convR(result));
        }
        if (Parser.IsRome & result < 1) {
            throw new Exception("Invalid");
        }
        else {
            System.out.println(result);
        }
    }
}