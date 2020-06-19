import cn.hutool.crypto.SecureUtil;

public class test {
    public static void main(String[] args) {
        String s = SecureUtil.md5(String.valueOf(123456));
        System.out.println(s);
    }
}
