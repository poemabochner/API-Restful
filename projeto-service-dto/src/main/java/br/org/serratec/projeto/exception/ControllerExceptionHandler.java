package br.org.serratec.projeto.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.org.serratec.projeto.EmailException;
import br.org.serratec.projeto.SenhaException;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(EmailException.class)
	protected ResponseEntity<Object> handleEmailExceptoin(EmailException ex) {
		return ResponseEntity.unprocessableEntity().body(ex.getMessage());
	}

	@ExceptionHandler(SenhaException.class)
	protected ResponseEntity<Object> handleEmailExceptoin(SenhaException ex) {
		return ResponseEntity.unprocessableEntity().body(ex.getMessage());
	}
}