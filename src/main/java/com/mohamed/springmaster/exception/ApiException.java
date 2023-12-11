package com.mohamed.springmaster.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;


public record ApiException (String message,Throwable throwable,HttpStatus httpStatus,ZonedDateTime zonedDateTime) {

}
