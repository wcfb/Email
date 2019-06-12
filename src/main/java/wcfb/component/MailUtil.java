package wcfb.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import wcfb.bean.MailBean;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * Created by wcfb on 2019/6/8
 */
@Component
public class MailUtil {

    @Value("${spring.mail.username}")
    String MAIL_SENDER;

    @Autowired
    JavaMailSender javaMailSender;

    Logger logger = LoggerFactory.getLogger(MailUtil.class);

    public void sendSimpleMail(MailBean mailBean){
       try {
           SimpleMailMessage mailMessage = new SimpleMailMessage();
           mailMessage.setFrom(MAIL_SENDER);
           mailMessage.setTo(mailBean.getRecipient());
           mailMessage.setSubject(mailBean.getSubject());
           mailMessage.setText(mailBean.getContent());
           javaMailSender.send(mailMessage);
       } catch (Exception e){
           System.out.println("发送失败");
           logger.error("发送失败");
       }
    }

    public void sendMail(MailBean mailBean){
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

            helper.setFrom(MAIL_SENDER);
            helper.setTo(mailBean.getRecipient());
            helper.setSubject(mailBean.getSubject());
            helper.setText(mailBean.getContent());
            helper.addAttachment("bfx.png",
                    new File("E:\\图片\\精美的APP图片\\头像\\bfx.png"));
            javaMailSender.send(mimeMessage);
        } catch (Exception e){
            System.out.println("发送失败");
            logger.error("发送失败");
        }
    }
}
