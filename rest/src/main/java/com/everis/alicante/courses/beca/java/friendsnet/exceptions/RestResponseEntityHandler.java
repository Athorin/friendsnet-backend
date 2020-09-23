package com.everis.alicante.courses.beca.java.friendsnet.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Clase que gestiona las excepciones
 * @author Pakychoko
 *
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestResponseEntityHandler {

	private static final Logger LOG = LoggerFactory.getLogger(RestResponseEntityHandler.class);
	
	protected ResponseEntity<?> handleServiceException(BaseException ex) {
		LOG.error(ex.getMessage());
		// TODO falta tener un objeto que cree el Json de salida
		// return ResponseEntity.status(obtenerStatus(ex)).body(obtenerBaseResponse());
		return null;
	}
	
	// Obtener status
	
	private HttpStatus obtenerStatus(Throwable ex) {
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		ResponseStatus responseStatus = AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class);
		
		if(responseStatus != null) {
			status = responseStatus.value();
		}
		return status;
	}
	
	private HttpStatus obtenerStatus(BaseException ex) {
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		String errorCode = ex.getErrorCode();
		
		if(errorCode != null) {
			status = HttpStatus.valueOf(Integer.parseInt(errorCode));
		}
		return status;
	}
}
