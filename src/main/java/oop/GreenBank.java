package oop;

public class GreenBank implements CounterMachine {
    @Override
    public int calcMonies(Money[] monies) {
        System.out.println("This is GreenBank");
        int result = 0;
        for (int i = 0; i < monies.length; i++) {
            result+=monies[i].getCount() * monies[i].getRating();
        }
        return result;
    }
}
