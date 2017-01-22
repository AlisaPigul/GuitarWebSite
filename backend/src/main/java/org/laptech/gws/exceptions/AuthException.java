package org.laptech.gws.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author rlapin
 */
@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class AuthException extends RuntimeException{
}
