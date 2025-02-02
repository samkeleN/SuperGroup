public class AlternatingCase {
    public static void main(String[] args) {
        String str = "Za^B8g@E2jH*kWl!MoPqXr7YvT1c$Fs3Ud9IwZ&yX0pLkV6sHqN^tB4rA+oZ%gFj";
        System.out.println(reformatString(str));
    }

    public static String reformatString(String str) {
        StringBuilder result = new StringBuilder();
        boolean isUpperCase = true;

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (isUpperCase) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                isUpperCase = !isUpperCase; 
            } else {
                result.append(c); 
            }
        }

        return result.toString();
    }
}
