
public class Test {
    public static int getMinimumMoves(String word) {
        if (word == null || word.length() <= 1)
            return 0;

        int moves = 0;
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            int leftIndex = sb.indexOf(String.valueOf(currentChar), i); // Start searching from current position
            int rightIndex = sb.lastIndexOf(String.valueOf(currentChar));

            if (leftIndex != rightIndex) {
                sb.delete(leftIndex + 1, rightIndex);
                moves++;
                // Reset the loop to check from the beginning
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        // Test the function with the provided example
        String word = "abaaa";
        System.out.println("Ans:" + getMinimumMoves(word));
    }

}