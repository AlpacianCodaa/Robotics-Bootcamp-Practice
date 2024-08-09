public class LasagnaAction {
    public static void main(String[] args) {
        //Part Three
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected Number of Minutes: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining Number of Minutes: " + lasagna.remainingMinutesInOven(25.6));
        System.out.println("Preperation Time: " + lasagna.preperationTimeInMiutes(4));
        System.out.println("Total Time: " + lasagna.totalTimeInMinutes(6, 25));
    }
}
