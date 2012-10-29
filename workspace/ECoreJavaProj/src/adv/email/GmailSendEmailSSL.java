package adv.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;
 
public class GmailSendEmailSSL {
    public static final String USERNAME = "aneelsahu";
    public static final String PASSWORD = "dia&nonna";
 
    public static void main(String[] args) throws Exception {
        //
        // Email information such as from, to, subject and contents.
        //
        String mailFrom = "aneelsahu@gmail.com";
        String mailTo = "amrutabds@gmail.com";
        String mailSubject = "EMAIL FROM JAVA PROGRAM --SSL - Gmail Send Email Demo";
        String mailText = "EMAIL FROM JAVA PROGRAM --SSL - Gmail Send Email Demo";
 
        GmailSendEmailSSL gmail = new GmailSendEmailSSL();
        gmail.sendMail(mailFrom, mailTo, mailSubject, mailText);
    }
 
    private void sendMail(String mailFrom, String mailTo,
                          String mailSubject, String mailText)
            throws Exception {
 
        Properties config = createConfiguration();
 
        //
        // Creates a mail session. We need to supply username and
        // password for Gmail authentication.
        //
        Session session = Session.getInstance(config, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        GmailSendEmailSSL.USERNAME,
                        GmailSendEmailSSL.PASSWORD
                );
            }
        });
 
        //
        // Creates email message
        //
        Message message = new MimeMessage(session);
        message.setSentDate(new Date());
        message.setFrom(new InternetAddress(mailFrom));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
        message.setSubject(mailSubject);
        message.setText(mailText);
 
        //
        // Send a message
        //
        Transport.send(message);
    }
 
    private Properties createConfiguration() {
        return new Properties() {{
            put("mail.smtp.host", "smtp.gmail.com");
            put("mail.smtp.auth", "true");
            put("mail.smtp.port", "465");
            put("mail.smtp.socketFactory.port", "465");
            put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        }};
    }
}