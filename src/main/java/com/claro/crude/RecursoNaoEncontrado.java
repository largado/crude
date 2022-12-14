package com.claro.crude;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNaoEncontrado extends Exception{

    private static final long serialVersionUID = 1L;

    public RecursoNaoEncontrado(String message) {
        super(message);
    }
}
