public class RewardValue {
    private final double CashValue;
    public static final double MilestoCash = 0.0035;

    public RewardValue(double CashValue) {
        this.CashValue = CashValue;
    }

    public RewardValue(int milesValue) {
        this.CashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MilestoCash);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MilestoCash;
    }

    public double getCashValue() {
        return CashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.CashValue);
    }
}
