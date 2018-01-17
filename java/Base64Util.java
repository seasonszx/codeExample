
import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base64Util 双向加密算法
 * @author seasonszx
 * @since 2017年11月15日
 * @version 1.0.0
 */
public class Base64Util {

    public static void main(String[] args) {
        System.out.println(encode("abc123"));
        System.out.println(decode("YWJjMTIz"));
        System.out.println(encode("abc123", 2));
        System.out.println(decode("WVdKak1USXo=", 2));
        System.out.println(encode("abc123", 3));
        System.out.println(decode("V1ZkS2FrMVVTWG89", 3));
    }

    public static String encode(String str) {
        String result = str;
        try {
            result = Base64.getEncoder().encodeToString(result.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String decode(String str) {
        String result = str;
        try {
            result = new String(Base64.getDecoder().decode(result.getBytes()), "utf-8");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Base64 加密
     * 
     * @param str
     *            待加密字符串
     * @param count
     *            加密次数
     * @return
     */
    public static String encode(String str, int count) {
        String result = str;
        try {
            for (int i = 0; i < count; i++) {
                result = Base64.getEncoder().encodeToString(result.getBytes("utf-8"));
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Base64 解密
     * 
     * @param str
     *            待解密字符串
     * @param count
     *            解密次数
     * @return
     */
    public static String decode(String str, int count) {
        String result = str;
        try {
            for (int i = 0; i < count; i++) {
                result = new String(Base64.getDecoder().decode(result.getBytes()), "utf-8");
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}