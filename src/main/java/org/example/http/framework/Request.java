package org.example.http.framework;

import lombok.Builder;
import lombok.Value;

import java.util.Map;

@Value
@Builder
public class Request {
  String method;
  String path;
  // TODO: query
  Map<String, String> headers;
  @Builder.Default
  byte[] body = new byte[]{};
}
