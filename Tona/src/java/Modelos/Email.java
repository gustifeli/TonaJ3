/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author gusti
 */
public class Email {
    
    public static void sendEmail(String host, String port, final String userName, final String password,
            String toAddress, String subject, String message) throws AddressException, MessagingException {

        //sets propiedades del servidor SMTP
        Properties p = new Properties();
        p.put("mail.smtp.host", host);
        p.put("mail.smtp.port", port);
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");

        //crear nueva sesion con autenticador 
        Authenticator auth = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session s = Session.getInstance(p, auth);

        //crear nuevo mail
        Message msg = new MimeMessage(s);
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date(0, 0, 0));
        msg.setText(message);

        //enviar mail
        Transport.send(msg);
    }
    
}
