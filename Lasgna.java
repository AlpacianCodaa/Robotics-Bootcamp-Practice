public class Lasgna {
    final int MINUTES_IN_OVEN = 40;

    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    public double remainingMinutesInOven(double timeSpentInOven){
        return MINUTES_IN_OVEN - timeSpentInOven;
    }

    public int preperationTimeInMiutes(int amountOfLayers){
        return amountOfLayers * 2;
    } 
}
