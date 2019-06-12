package wcfb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wcfb.bean.MailBean;
import wcfb.component.MailUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    MailUtil mailUtil;

    @Test
    public void sendSimpleMail(){
        MailBean mailBean = new MailBean(
                "1390836670@qq.com",
                "测试",
                "这是一封测试邮件"
        );
        mailUtil.sendSimpleMail(mailBean);
    }

    @Test
    public void sendMail(){
        MailBean mailBean = new MailBean(
                "1390836670@qq.com",
                "测试",
                "这是一封测试邮件"
        );
        mailUtil.sendMail(mailBean);
    }
}
