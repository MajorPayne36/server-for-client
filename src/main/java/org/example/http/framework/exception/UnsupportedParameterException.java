package org.example.http.framework.exception;

public class UnsupportedParameterException extends ServerException {
  public UnsupportedParameterException() {
  }

  public UnsupportedParameterException(String message) {
    super(message);
  }

  public UnsupportedParameterException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnsupportedParameterException(Throwable cause) {
    super(cause);
  }

  public UnsupportedParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
