import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidatePasswordTest {

    @Test
    void testPasswordLength() {
        // given
        String testString = "HeyDu!";

        // when
        boolean actual = ValidatePassword.testPasswordLength(testString);

        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testPasswordforNumnbers() {
        // given
        String testString = "quetzalcoatl";

        // when
        boolean actual = ValidatePassword.testPasswordForNumbers(testString);

        // then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void testBadPassword() {
        // given
        String testString = "abcdefgh";

        // when
        boolean actual = ValidatePassword.badPassword(testString);

        // then
        Assertions.assertEquals(false, actual);
    }
}