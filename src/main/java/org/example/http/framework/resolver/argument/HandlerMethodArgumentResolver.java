package org.example.http.framework.resolver.argument;

import org.example.http.framework.Request;

import java.io.OutputStream;
import java.lang.reflect.Parameter;

public interface HandlerMethodArgumentResolver {
  boolean supportsParameter(Parameter parameter);
  Object resolveArgument(Parameter parameter, Request request, OutputStream response);
}
