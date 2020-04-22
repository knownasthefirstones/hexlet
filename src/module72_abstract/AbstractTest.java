package module72_abstract;

public abstract class AbstractTest implements ITest {

    @Override
    public void test1() {
        System.out.println("Test1");
    }

    // а тест2 будут реализовывать наследники
}
