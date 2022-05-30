public class Conv {
    public static String convR(int number) {
        int[] arabic = new int []{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanic = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < romanic.length; i++) {
            while (number >= arabic[i]) {
                number -= arabic[i];
                builder.append(romanic[i]);
            }
        }
        return builder.toString();
    }
}
