package oop;

import org.junit.Assert;
import org.junit.Test;

public class YellowBankUnitTest extends CounterMachineUnitTest{
    public YellowBankUnitTest() {
        super(new YellowBank(20));
    }

    @Test
    public void testResultCalc() {
        int result = counterMachine.calcMonies(monies);

        Assert.assertNotEquals(2021,result);
    }

    @Test
    public void testResultCalc2() {
        int result = counterMachine.calcMonies(monies);

        Assert.assertEquals(2001,result);
    }
}
