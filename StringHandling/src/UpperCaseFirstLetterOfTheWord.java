public class UpperCaseFirstLetterOfTheWord {
    public static void main(String[] args) {
        String word = "hello world people";
        char[] characterArray = word.toCharArray();
        int size = characterArray.length;
        int i = 0;

        while (i < size) {
            if (i == 0) {
                characterArray[i] = (char) (characterArray[i] - 32);
            } else {
                if (characterArray[i - 1] == ' '){
                    characterArray[i] = (char) (characterArray[i] - 32);
                }
            }
            i++;
        }

        System.out.println(characterArray);
    }
}
