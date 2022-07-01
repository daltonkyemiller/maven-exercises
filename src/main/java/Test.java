import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in  = sc.nextLine();

        if (StringUtils.isNumeric(in)) {
            System.out.println("Numeric");
        } else {
            System.out.println("Not numeric");
        }

        System.out.println(StringUtils.swapCase(in));
        System.out.println(StringUtils.reverse(in));

    }
}
