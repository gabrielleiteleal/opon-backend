package br.com.opon.opon_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AvaliacaoNaoEncontrada extends RuntimeException {
    public AvaliacaoNaoEncontrada(String message) {
        super(message);
    }
}
