package enrollmentinquery.utility;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import enrollmentinquery.constant.Constant;


@Component
@ConfigurationProperties
@PropertySource("classpath:application.properties")
public class Email {
	@Autowired
	private Environment env;
	private static final Logger LOG = LoggerFactory.getLogger(Email.class);
	@Value("${mail.smtp.host}")
	private String smtpHost;
	@Value("${mail.smtp.port}")
	private String smtpPort;
	@Value("${mail.from}")
	private String emailFrom;
	@Value("${mail.pass}")
	private String emailPass;
	
	private Properties setPropertes() {
		Properties props = new Properties();
		/*
		 * props.put("mail.smtp.auth",
		 * env.getProperty("spring.mail.properties.mail.smtp.auth"));
		 * props.put("mail.smtp.starttls.enable",
		 * env.getProperty("spring.mail.properties.mail.smtp.starttls.enable"));
		 * props.put("mail.smtp.host", env.getProperty("spring.mail.host"));
		 * props.put("mail.smtp.port",env.getProperty("spring.mail.port"));
		 */

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.port", smtpPort );

		return props;
	}

	private Session getSession() {
		Session session = Session.getInstance(setPropertes(), new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailFrom,emailPass);
			}
		});
		return session;
	}

	 
	/**
	 * Generic method to send email
	 * 
	 * @param emailFrom
	 * @param emailTo
	 * @param content
	 * @param subject
	 */
	public void sendEmail(String mailFrom, String mailTo, String content, String subject) {
		try {
			Message msg = new MimeMessage(getSession());
			msg.setFrom(new InternetAddress(mailFrom != null ? mailFrom : emailFrom, true));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo != null ? mailTo : mailFrom));
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			Multipart multipart = new MimeMultipart();
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			messageBodyPart.setContent(content, "text/html");
			multipart.addBodyPart(messageBodyPart);
			msg.setContent(multipart);
			Transport.send(msg);
		} catch (MessagingException e) {
			LOG.error(" Error while sending mail ");
			e.printStackTrace();
		} catch (Exception e) {
			LOG.error(" Error while sending mail ");
			e.printStackTrace();
		}
	}
}
