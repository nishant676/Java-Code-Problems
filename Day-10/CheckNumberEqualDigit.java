import java.util.*;

class CheckNumberEqualDigit 
 {
    public static void main(String[] args) {
        boolean flag = true;
        String num = "1210";
        Map<Character, Integer> mp = new LinkedHashMap<>();

        for (Character cp : num.toCharArray()) {
            mp.put(cp, mp.getOrDefault(cp, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            // how many times i should appear
            int expectedValue = num.charAt(i) - '0'; 
            
            // convert i = 0, 1, 2,... to '0', '1', '2'...
            char digitChar = (char)(i + '0');     

            int actualCount = mp.getOrDefault(digitChar, 0);

            if (expectedValue != actualCount) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
