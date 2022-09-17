class Solution {

    public double angleClock(int hour, int minutes) {
        double hourAngle = 0.5 * (hour * 60 + minutes);
        double minutesAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minutesAngle);

        if (angle < 180.0) {
            return angle;
        } else {
            return 360.0 - angle;
        }
    }
}
