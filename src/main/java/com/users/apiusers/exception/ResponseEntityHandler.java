package com.users.apiusers.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ResponseEntityHandler extends RuntimeException{

    @ResponseStatus(code = HttpStatus.OK)
    protected ResponseEntity ResponseEntity(HttpHeaders headers, HttpStatus status, WebRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("status", status.value());
        return new ResponseEntity(map,HttpStatus.OK);
    }
}
