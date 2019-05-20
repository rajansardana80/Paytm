package com.qa.data;

import java.util.List;

public class ReverseShipperResponse {

private String message;
private Integer statusCode;
private List<String> stack = null;
private String status;
private String error;

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public Integer getStatusCode() {
return statusCode;
}

public void setStatusCode(Integer statusCode) {
this.statusCode = statusCode;
}

public List<String> getStack() {
return stack;
}

public void setStack(List<String> stack) {
this.stack = stack;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getError() {
return error;
}

public void setError(String error) {
this.error = error;
}

}
