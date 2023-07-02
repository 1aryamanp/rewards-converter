public class RewardValue {
    double cash;
    double miles;

    public RewardValue(double cash){
        this.cash=cash;
    }
    public RewardValue(int miles){
        this.miles=miles;
    }


    public double getMilesValue() {
        miles=  cash*0.0035;
        return miles;
    }

    public double getCashValue() {
        return cash;
    }
}
