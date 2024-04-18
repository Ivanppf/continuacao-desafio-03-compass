package br.com.compassuol.sp.challenge.msnotification.services;

import br.com.compassuol.sp.challenge.msnotification.entities.Email;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    public void sendEmail(Email email) {
        System.out.println(email);
    }
}
