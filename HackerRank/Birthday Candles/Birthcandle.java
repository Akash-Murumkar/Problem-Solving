import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int tallestCandle = candles.get(candles.size() - 1);
        int ans =0;
        for(int i=candles.size()-1; i>=0; i--)
        {
            if(candles.get(i).equals(tallestCandle))
            {
                ans++;
            }
            else{
                break;
            }
        }
        return ans;

    }

}
public class Birthcandle
{
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        System.out.println(result); // Print the result to the terminal

        bufferedReader.close();
    }
}