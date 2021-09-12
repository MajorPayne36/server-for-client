package org.example.http.framework.exception;

public class RequestHandleException extends ServerException{
  public RequestHandleException() {
    super();
  }

  public RequestHandleException(String message) {
    super(message);
  }

  public RequestHandleException(String message, Throwable cause) {
    super(message, cause);
  }

  public RequestHandleException(Throwable cause) {
    super(cause);
  }

  public RequestHandleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
