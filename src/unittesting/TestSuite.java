package unittesting;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        { TestCalculator.class,
                TestCalculator1.class,
                TestCalculator2.class }
)


public class TestSuite {

}
