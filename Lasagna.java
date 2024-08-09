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

    public int preperationTimeInMiutes(int amountOfLayers){
        return amountOfLayers * 2;
    } 

    //Part Three
    public double totalTimeInMinutes(int amountOfLayers, double timeSpentInOven) {
        return (amountOfLayers * 2) + timeSpentInOven;
    }
}
