package oop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class CounterMachineUnitTest {
    protected CounterMachine counterMachine;
    protected Money[] monies;

    public CounterMachineUnitTest(CounterMachine counterMachine) {
        this.counterMachine = counterMachine;
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("before class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
        monies = new Money[]{
                new Money(1, 11),
                new Money(2, 5),
                new Money(5, 200),
                new Money(10, 100)
        };
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("after class");
    }
}
