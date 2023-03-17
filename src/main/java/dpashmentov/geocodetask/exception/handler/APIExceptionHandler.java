package dpashmentov.geocodetask.exception.handler;

import feign.FeignException;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;

@ControllerAdvice
@Slf4j
@NoArgsConstructor
public class APIExceptionHandler {

    @ExceptionHandler({FeignException.class})
    public ResponseEntity<?> handleException(RuntimeException e) {
        log.info("{}", e.getMessage());
        return ResponseEntity.badRequest().body(Collections.singletonMap("exception", e.getMessage()));
    }
}
