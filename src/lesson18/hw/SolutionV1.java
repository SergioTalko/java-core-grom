package lesson18.hw;

public class SolutionV1 {

    public int[] findNumbers(String text) {
        if (text.isEmpty() || text == null) return null;

        int index = 0;
        String[] words = text.split(" ");
        int[] res = new int[countNumbers(text)];

        for (int i = 0; i < words.length; i++) {
            try {
                res[index] = Integer.parseInt(words[i]);
                index++;

            } catch (Exception e) {
                System.out.println(words[i] + " not a number");
            }
        }

        return res;
    }

    private int countNumbers(String text) {
        if (text.isEmpty() || text == null) return 0;

        int count = 0;
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (isDigit(words[i])){
                count++;
            }
        }

        return count;
    }

    private boolean isDigit(String word) {

        for (char ch : word.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
