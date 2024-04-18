package br.com.compassuol.sp.challenge;

import java.io.Serializable;

public record EmailDTO(
        String to,
        String subject,
        String body
) implements Serializable {
}
