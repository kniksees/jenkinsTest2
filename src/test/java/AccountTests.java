import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)


public class AccountTests {
    public static String name;
    public static boolean expected;

    public AccountTests(String name, boolean expected) {
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
    @DisplayName("Parameterized full-name test")
    public void parametersAccountTests() {
        Account account = new Account(name);
        Assert.assertEquals(account.checkNameToEmboss(), expected);
        }



}
