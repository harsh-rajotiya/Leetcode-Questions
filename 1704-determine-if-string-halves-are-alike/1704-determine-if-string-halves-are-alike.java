class Solution {

    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2, s.length());
        String vowels = "AEIOUaeiou";

        int count1 = 0; //no. of vowels in substring a
        int count2 = 0; //no. of vowels in substring b

        for (int i = 0; i < a.length(); i++) {
            //It will check if the character at i is present in the vowels string more than               0 times and increase the count of vowels it that string
            if (vowels.indexOf(a.charAt(i)) >= 0) {
                count1++;
            }
            if (vowels.indexOf(b.charAt(i)) >= 0) {
                count2++;
            }
        }

        return count1 == count2;
    }
}
