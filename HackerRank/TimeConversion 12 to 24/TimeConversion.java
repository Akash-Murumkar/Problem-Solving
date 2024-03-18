import java.util.Scanner;

/*/**
 * 
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

 */
class Result {
    public static String timeConversion(String s) {
        // Write your code here
        String time = s.substring(2, 8);
        String AMOrPM = s.substring(8, s.length());
        String timeh = s.substring(0, 2);
        if (AMOrPM.equals("PM") && !timeh.equals("12")) {
            int hours = Integer.parseInt(timeh) + 12;
            return hours + time;
        } else if (AMOrPM.equals("AM") && timeh.equals("12")) {
            return "00" + time;
        }
        return timeh + time;

    }
}

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time: ");
        String s = scanner.nextLine();

        String result = Result.timeConversion(s);
        System.out.println("Result :" + result);
    }

}