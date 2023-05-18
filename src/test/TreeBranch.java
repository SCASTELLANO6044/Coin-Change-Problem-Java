package test;

public class TreeBranch {
    private int coinValue;
    private int remaining;

    public TreeBranch(int coinValue, int remaining) {
        this.coinValue = coinValue;
        this.remaining = remaining;
    }

    public int getCoinValue() {
        return coinValue;
    }

    public int getRemaining() {
        return remaining;
    }
}
