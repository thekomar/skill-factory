package oop;

public class YellowBank implements CounterMachine {
    private int commission;

    public YellowBank(int commission) {
        this.commission = commission;
    }

    @Override
    public int calcMonies(Money[] monies) {
        System.out.println("This is YellowBank");
        int result = 0;
        for (int i = 0; i < monies.length; i++) {
            result += monies[i].getCount() * monies[i].getRating();
        }
        return result - commission;
    }
}
