import java.util.HashSet;

public class LogestUniqueSubstringInAString {

    public static String uniqueSubstring(String a) {
        String output = "";
        int maxLength = 0;

        for (int i = 0; i < a.length(); i++) {
            HashSet<Character> uni = new HashSet<>();
            StringBuilder currentSubstring = new StringBuilder();

            for (int j = i; j < a.length(); j++) {
                char temp = a.charAt(j);

                if (uni.contains(temp)) {
                    break;
                } else {
                    uni.add(temp);
                    currentSubstring.append(temp);
                }
            }

            // Update the longest substring if the current one is longer
            if (currentSubstring.length() > maxLength) {
                maxLength = currentSubstring.length();
                output = currentSubstring.toString();
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "unique";
        System.out.println(uniqueSubstring(s)); // Expected output: "uniq"
    }
}
