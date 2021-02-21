package com.srijan.location.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender sender;
	
	public void sendEmail(String toAddress,String subject,String body)
	{
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(toAddress);
		msg.setSubject(subject);
		msg.setText(body);
		sender.send(msg);
	}
}
//www.google.com/settings/security/lesssecureapps  
//Turn on the above settings to send mail

/*MimeMessage message = sender.createMimeMessage();
MimeMessageHelper helper=new MimeMessageHelper(message);
try {
	helper.setTo(toAddress);
	helper.setSubject(subject);
	helper.setText(body);
} catch (MessagingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
sender.send(message);*/