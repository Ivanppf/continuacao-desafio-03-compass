package br.com.compassuol.sp.challenge.msnotification.entities;

import br.com.compassuol.sp.challenge.EmailDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Email {
    private String fromEmail;
    private String fromName;
    private String replyTo;
    private String to;
    private String subject;
    private String body;
    private String contentType;


    public Email(EmailDTO emailDTO) {
        this.fromEmail = "msNotificationApi@gmail.com";
        this.fromName = "msNotification";
        this.to = emailDTO.to();
        this.subject = emailDTO.subject();
        this.body = emailDTO.body();
    }
}


