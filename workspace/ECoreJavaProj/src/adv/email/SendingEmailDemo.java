package adv.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendingEmailDemo {
	public static void main(String[] args) {
		
        String from = "aneelsahu@gmail.com";
        String to = "aneelsahu@gmail.com";
        String subject = "Hi There...";
        String text = "How are you?";

        //
        // A properties to store mail server smtp information such 
        // as the host name and the port number. With this properties 
        // we create a Session object from which we'll create the 
        // Message object.
        //
        
        try {
        //
        // Message is a mail message to be send through the 
        // Transport object. In the Message object we set the 
        // sender address and the recipient address. Both of 
        // this address is a type of InternetAddress. For the 
        // recipient address we can also set the type of 
        // recipient, the value can be TO, CC or BCC. In the next
        // two lines we set the email subject and the content text.
        //
        	
        Properties properties = new Properties();        
        properties.put("mail.smtp.host", "smtp.gmail.com");        
        properties.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(properties, null);
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO,
                new InternetAddress(to));
        message.setSubject(subject);
        message.setText(text);
        System.out.println("sssssss");
        //
        // Send the message to the recipient.
        //
        Transport.send(message);
        System.out.println("sssssssff");
        } catch (MessagingException e) {
            System.out.println("ssssssadsfasffssff");
            e.printStackTrace();

        e.printStackTrace();
        }
}
}