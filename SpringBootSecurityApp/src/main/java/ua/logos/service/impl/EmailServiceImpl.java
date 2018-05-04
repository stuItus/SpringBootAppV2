package ua.logos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import ua.logos.mail.Mail;
import ua.logos.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired private JavaMailSender mailSender;
	
	@Override
	public void sendMessage(Mail mail) {
		// TODO Auto-generated method stub
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(mail.getFrom());
		message.setTo(mail.getTo());
		message.setSubject(mail.getSubject());
		message.setText(mail.getContent());
		
		mailSender.send(message);
	}

}
