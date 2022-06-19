import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class AccountTest {
    public static String name;
    public static boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {"Erofeev Dmitry", true},
                {"Erofeev Dmitry1234567890", false},
                {"Erofeev  Dmitry", false},
                {" ErofeevDmitry", false},
                {"ErofeevDmitry ", false}
        };
    }
    @Test
    public void parametersAccountTests() {
        Account account = new Account(name);
        Assert.assertEquals(account.checkNameToEmboss(), expected);
        }
}