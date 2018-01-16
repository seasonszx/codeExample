
import java.util.Random;

import com.lexunedu.commons.utils.SMSCodeHelper;

/***
 * 生成短信6位验证码
 */
public class SMSCodeHelper {
    private static char[] codeSequence = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    private static int codeCount = 6;// 短信验证码的个数

    public static String generateeSMSCode() {

        // 创建一个随机数生成器类
        Random random = new Random();
        StringBuffer randomCode = new StringBuffer();

        // 随机产生codeCount数字的验证码。
        for (int i = 0; i < codeCount; i++) {
            // 得到随机产生的验证码数字。
            String code = String.valueOf(codeSequence[random.nextInt(6)]);

            // 将产生的6个随机数组合在一起。
            randomCode.append(code);
        }
        return randomCode.toString();
    }
    
    public static void main(String[] args) {
        String code = SMSCodeHelper.generateeSMSCode();
        System.out.println("验证码："+code);
    }
}
