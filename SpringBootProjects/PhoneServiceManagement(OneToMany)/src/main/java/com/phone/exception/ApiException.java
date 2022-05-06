package com.phone.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ApiException
{
     private Date timeStamp;
     private String message;
     private String details;
}
