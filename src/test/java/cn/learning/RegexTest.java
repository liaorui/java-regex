package cn.learning;

import cn.learning.regex.Matcher;
import cn.learning.regex.Pattern;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RegexTest {
    @Test
    public void test1() {
        String s1 = "a().characteristics.characteristics.characteristics;";
        Pattern pat = Pattern.compile("(?<assignationtype>[^=(new|throw new)]\\w+\\s+)?(?:(?<assignationTargets>(?<assignationtarget>\\w+\\.)*)(?<assignation>\\w+(?:\\[\\w+\\])?\\s*(?:=|:\\*=)\\s*))?(?<stereotype>new|throw new)?\\s?(?<targets>(?<target>[^\\.]+\\.)*)(?<name>[_\\w]+)\\((?<arguments>(?<argument>[^,]+,?)*)\\);");
        Matcher matcher = pat.matcher(s1);
        System.out.println(matcher.matches());
    }

    @Test
    public void test2() {
        Pattern pattern = Pattern.compile("^([+-]?((0[xX](\\p{XDigit}+))|(((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)))|[n|N]?'([^']*(?:'')*[^']*)*')");
        Matcher matcher = pattern.matcher("'%)) order by ANGEBOT.ID");
        System.out.println(matcher.find());
    }

    @Test
    public void test3() {
        Pattern pattern = Pattern.compile("(x+x+)+y");
        Matcher matcher = pattern.matcher("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(matcher.matches());
    }

    @Test
    public void test4() {
        Pattern pattern = Pattern.compile("(([0-9A-Z]+)([_]?+)*)*");
        System.out.println(pattern.matcher("FOOOOO_BAAAR_FOOOOOOOOO_BA_ ").matches());
    }
}
