package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProgram {
    public static void main(String[] args) {

        String slowo
                = "Ala    ma kota    ,   kot ma   alę";
        String[] slowa = slowo.split("\\s+");
        System.out.println(Arrays.toString(slowa));

        String slowo2 = slowo.replaceAll("\\s+", " ");
        System.out.println(slowo2);

        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(slowo);
        String slowo3 = matcher.replaceAll(" ");
        System.out.println(slowo3);
    }
}
