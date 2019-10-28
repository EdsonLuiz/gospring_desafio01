package gostack.desafio01.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ResourceNotFoundExeception
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotFoundExeception extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundExeception(String message) {
        super(message);
    }

}