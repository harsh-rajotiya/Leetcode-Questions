public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;

        for (int i = 0; i < 32; i++) {
            reverse = reverse << 1; //it will create a space at the place of last bit removed
            reverse = reverse | (n & 1); //it will take the last bit and will save it in reverse variable
            n = n >> 1; //last digit will be removed
        }

        return reverse;
    }
}
