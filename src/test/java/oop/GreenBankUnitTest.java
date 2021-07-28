package oop;

import org.junit.Assert;
import org.junit.Test;

public class GreenBankUnitTest extends CounterMachineUnitTest{
    public GreenBankUnitTest() {
        super(new GreenBank());
    }

    @Test
    public void testCalcResultBank() {
        int result = counterMachine.calcMonies(monies);
        Assert.assertEquals(2021,result);
    }
    @Test
    public void testCalcResultBank2(){
        int result = counterMachine.calcMonies(monies);
        Assert.assertNotEquals(0,result);
    }

}
