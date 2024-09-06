package javarush;

public class LettersSubsequence {
    public static void main(String[] args) {
        System.out.println(getMaxLetterSequenceLength(6817L) + " в числе 1АА1");
        System.out.println(getMaxLetterSequenceLength(447355553L) + " в числе 1AAA1AA1");
        System.out.println(getMaxLetterSequenceLength(2826957L) + " в числе 2B22CD");
        System.out.println(getMaxLetterSequenceLength(4660L) + " в числе 1234");
        System.out.println(getMaxLetterSequenceLength(240589L) + " в числе 3ABCD");
        System.out.println(getMaxLetterSequenceLength(56695L) + " в числе DD77");
        System.out.println(getMaxLetterSequenceLength(160L) + " в числе A0");
    }

    public static int getMaxLetterSequenceLength(long number) {
        int maxLength = 0;
        int currentLength = 0;
        boolean inSequence = false;
        boolean wasDigit = false;

        for (char c : Long.toHexString(number).toCharArray()) {
            if (Character.isDigit(c)) {
                wasDigit = true;
                if (inSequence) {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 0;
                    inSequence = false;
                }
            } else if (wasDigit) {
                currentLength++;
                if (!inSequence) {
                    inSequence = true;
                }
            }
        }
        return maxLength;
    }
}
