package org.laptech.gws.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Roman_Lapin on 1/16/2017.
 */
@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class UserAlreadyExistsException extends AuthException {
}
