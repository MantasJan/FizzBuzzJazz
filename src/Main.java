import java.util.ArrayList;
import java.util.List;

public class Main {

    enum Rule {

        FIZZ(3,"Fizz"),
        BUZZ(5, "Buzz"),
        JAZZ(7, "Jazz");

        final int divisor;
        final String word;

        Rule(int divisor, String word) {
            this.divisor = divisor;
            this.word = word;
        }
    }

    private static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; ++i) {
            String temp = "";

            for (Rule rule : Rule.values()) {
                if (isDivisibleBy(i, rule.divisor)) {
                    temp += rule.word;
                }
            }

            if(temp.isEmpty()) {
                temp += Integer.toString(i);
            }

            result.add(temp);
        }

        return result;
    }

    private static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public static void main(String[] args) {

        int n = 50;
        List<String> result = fizzBuzz(n);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

}