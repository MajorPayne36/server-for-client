package org.example.http.framework;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.Map;

@Value
@Builder
public class Request {
  String method;
  String path;
  Map<String, List<String>> query;
  Map<String, List<String>> form;
  Map<String, String> headers;
  @Builder.Default
  byte[] body = new byte[]{};
}
