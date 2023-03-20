public class CountVowelsConsonantsSpecialChars {
    public static void main(String[] args) {
        String word = "My people's blessings will continue to reign, Amen !";
        word = word.toLowerCase();
        char[] wordArray = word.toCharArray();
        int size = wordArray.length;
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCount = 0;
        int i = 0;

        while (i < size) {
            if (wordArray[i] >= 'a' && wordArray[i] <= 'z') {
                if (wordArray[i] == 'a' || wordArray[i] == 'e' || wordArray[i] == 'i' || wordArray[i] == 'o' || wordArray[i] == 'u'){
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                specialCount++;
            }

            i++;
        }

        System.out.println(vowelCount);
        System.out.println(consonantCount);
        System.out.println(specialCount);
    }
}
