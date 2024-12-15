package BarkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // Invalid hour
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true; // Barking at night
        }
        return false; // All other cases
    }
}