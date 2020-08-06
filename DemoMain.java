import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author zyf
 * @date 2020-03-14 15:03
 * @describe : 这个类是平时方便跟源码的main方法
 */
public class DemoMain {
    static StringBuilder value = null;

    public static void main(String[] args) {
        System.out.println(join("-", Arrays.asList("小明", "小红", "小刚")));
    }

    private static String join(String delimdel, List<String> list) {
        list.forEach(e -> add(delimdel).append(e));
        return value.toString();
    }


    private static StringBuilder add(String delimdel) {
        if (Objects.isNull(value)) {
            value = new StringBuilder().append("");
        } else {
            value.append(delimdel);
        }
        return value;
    }
}
