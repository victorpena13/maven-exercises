import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

public class DependencyManagement {

    @Test
    public void testIfNameIsEqual() {
        String expected = "test";
        String actual = "Test";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.next();
        System.out.println(StringUtils.isNumeric(userString));
        System.out.println(StringUtils.reverse(userString));
        System.out.println(StringUtils.swapCase(userString));

    }
}
