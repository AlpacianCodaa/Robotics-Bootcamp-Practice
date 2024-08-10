public class Lasagna {
    final int MINUTES_IN_OVEN = 40;
    
    //Part One
    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    //Part Two
    public double remainingMinutesInOven(double timeSpentInOven){
        return MINUTES_IN_OVEN - timeSpentInOven;
    }

    public static int preperationTimeInMinutes(int amountOfLayers){
        return amountOfLayers * 2;
    } 

    //Part Three
    public double totalTimeInMinutes(int layers, double timeSpentInOven) {
        return preperationTimeInMinutes(layers) + timeSpentInOven;
    }
}
