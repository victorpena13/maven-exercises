import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

public class DependencyManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.next();
        System.out.println(StringUtils.isNumeric(userString));
        System.out.println(StringUtils.reverse(userString));
        System.out.println(StringUtils.swapCase(userString));

    }
}
