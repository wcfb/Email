package wcfb.bean;

import java.io.Serializable;

/**
 * Created by wcfb on 2019/6/8
 */
public class MailBean implements Serializable {

    //邮件接收人
    String recipient;
    //邮件的主题
    String subject;
    //邮件的内容
    String content;

    public MailBean() {
    }

    public MailBean(String recipient, String subject, String content) {
        this.recipient = recipient;
        this.subject = subject;
        this.content = content;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MailBean{" +
                "recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
