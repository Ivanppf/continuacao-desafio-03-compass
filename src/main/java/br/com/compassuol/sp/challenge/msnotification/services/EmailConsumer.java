package br.com.compassuol.sp.challenge.msnotification.services;

import br.com.compassuol.sp.challenge.EmailDTO;
import br.com.compassuol.sp.challenge.msnotification.entities.Email;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmailConsumer {

    private EmailSender emailSender;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(EmailDTO emailDTO) {
        Email email = new Email(emailDTO);
        emailSender.sendEmail(email);
    }
}
