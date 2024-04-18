package br.com.compassuol.sp.challenge.msauthorization.business.services;

import br.com.compassuol.sp.challenge.EmailDTO;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitmqService {

    private RabbitTemplate rabbitTemplate;

    public void enviarEmail(String queueName, EmailDTO emailDTO) {
        rabbitTemplate.convertAndSend(queueName, emailDTO);
    }

}
