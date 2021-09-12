package org.example.http.framework.exception;

public class MalformedRequestException extends ServerException {
  public MalformedRequestException() {
  }

  public MalformedRequestException(String message) {
    super(message);
  }

  public MalformedRequestException(String message, Throwable cause) {
    super(message, cause);
  }

  public MalformedRequestException(Throwable cause) {
    super(cause);
  }

  public MalformedRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
