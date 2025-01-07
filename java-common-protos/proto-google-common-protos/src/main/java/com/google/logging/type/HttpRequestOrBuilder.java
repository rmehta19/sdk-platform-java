/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/type/http_request.proto

// Protobuf Java Version: 3.25.5
package com.google.logging.type;

public interface HttpRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.type.HttpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * </pre>
   *
   * <code>string request_method = 1;</code>
   *
   * @return The requestMethod.
   */
  java.lang.String getRequestMethod();
  /**
   *
   *
   * <pre>
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * </pre>
   *
   * <code>string request_method = 1;</code>
   *
   * @return The bytes for requestMethod.
   */
  com.google.protobuf.ByteString getRequestMethodBytes();

  /**
   *
   *
   * <pre>
   * The scheme (http, https), the host name, the path and the query
   * portion of the URL that was requested.
   * Example: `"http://example.com/some/info?color=red"`.
   * </pre>
   *
   * <code>string request_url = 2;</code>
   *
   * @return The requestUrl.
   */
  java.lang.String getRequestUrl();
  /**
   *
   *
   * <pre>
   * The scheme (http, https), the host name, the path and the query
   * portion of the URL that was requested.
   * Example: `"http://example.com/some/info?color=red"`.
   * </pre>
   *
   * <code>string request_url = 2;</code>
   *
   * @return The bytes for requestUrl.
   */
  com.google.protobuf.ByteString getRequestUrlBytes();

  /**
   *
   *
   * <pre>
   * The size of the HTTP request message in bytes, including the request
   * headers and the request body.
   * </pre>
   *
   * <code>int64 request_size = 3;</code>
   *
   * @return The requestSize.
   */
  long getRequestSize();

  /**
   *
   *
   * <pre>
   * The response code indicating the status of response.
   * Examples: 200, 404.
   * </pre>
   *
   * <code>int32 status = 4;</code>
   *
   * @return The status.
   */
  int getStatus();

  /**
   *
   *
   * <pre>
   * The size of the HTTP response message sent back to the client, in bytes,
   * including the response headers and the response body.
   * </pre>
   *
   * <code>int64 response_size = 5;</code>
   *
   * @return The responseSize.
   */
  long getResponseSize();

  /**
   *
   *
   * <pre>
   * The user agent sent by the client. Example:
   * `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET
   * CLR 1.0.3705)"`.
   * </pre>
   *
   * <code>string user_agent = 6;</code>
   *
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   *
   *
   * <pre>
   * The user agent sent by the client. Example:
   * `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET
   * CLR 1.0.3705)"`.
   * </pre>
   *
   * <code>string user_agent = 6;</code>
   *
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString getUserAgentBytes();

  /**
   *
   *
   * <pre>
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP
   * request. This field can include port information. Examples:
   * `"192.168.1.1"`, `"10.0.0.1:80"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * </pre>
   *
   * <code>string remote_ip = 7;</code>
   *
   * @return The remoteIp.
   */
  java.lang.String getRemoteIp();
  /**
   *
   *
   * <pre>
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP
   * request. This field can include port information. Examples:
   * `"192.168.1.1"`, `"10.0.0.1:80"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * </pre>
   *
   * <code>string remote_ip = 7;</code>
   *
   * @return The bytes for remoteIp.
   */
  com.google.protobuf.ByteString getRemoteIpBytes();

  /**
   *
   *
   * <pre>
   * The IP address (IPv4 or IPv6) of the origin server that the request was
   * sent to. This field can include port information. Examples:
   * `"192.168.1.1"`, `"10.0.0.1:80"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * </pre>
   *
   * <code>string server_ip = 13;</code>
   *
   * @return The serverIp.
   */
  java.lang.String getServerIp();
  /**
   *
   *
   * <pre>
   * The IP address (IPv4 or IPv6) of the origin server that the request was
   * sent to. This field can include port information. Examples:
   * `"192.168.1.1"`, `"10.0.0.1:80"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * </pre>
   *
   * <code>string server_ip = 13;</code>
   *
   * @return The bytes for serverIp.
   */
  com.google.protobuf.ByteString getServerIpBytes();

  /**
   *
   *
   * <pre>
   * The referer URL of the request, as defined in
   * [HTTP/1.1 Header Field
   * Definitions](https://datatracker.ietf.org/doc/html/rfc2616#section-14.36).
   * </pre>
   *
   * <code>string referer = 8;</code>
   *
   * @return The referer.
   */
  java.lang.String getReferer();
  /**
   *
   *
   * <pre>
   * The referer URL of the request, as defined in
   * [HTTP/1.1 Header Field
   * Definitions](https://datatracker.ietf.org/doc/html/rfc2616#section-14.36).
   * </pre>
   *
   * <code>string referer = 8;</code>
   *
   * @return The bytes for referer.
   */
  com.google.protobuf.ByteString getRefererBytes();

  /**
   *
   *
   * <pre>
   * The request processing latency on the server, from the time the request was
   * received until the response was sent.
   * </pre>
   *
   * <code>.google.protobuf.Duration latency = 14;</code>
   *
   * @return Whether the latency field is set.
   */
  boolean hasLatency();
  /**
   *
   *
   * <pre>
   * The request processing latency on the server, from the time the request was
   * received until the response was sent.
   * </pre>
   *
   * <code>.google.protobuf.Duration latency = 14;</code>
   *
   * @return The latency.
   */
  com.google.protobuf.Duration getLatency();
  /**
   *
   *
   * <pre>
   * The request processing latency on the server, from the time the request was
   * received until the response was sent.
   * </pre>
   *
   * <code>.google.protobuf.Duration latency = 14;</code>
   */
  com.google.protobuf.DurationOrBuilder getLatencyOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether or not a cache lookup was attempted.
   * </pre>
   *
   * <code>bool cache_lookup = 11;</code>
   *
   * @return The cacheLookup.
   */
  boolean getCacheLookup();

  /**
   *
   *
   * <pre>
   * Whether or not an entity was served from cache
   * (with or without validation).
   * </pre>
   *
   * <code>bool cache_hit = 9;</code>
   *
   * @return The cacheHit.
   */
  boolean getCacheHit();

  /**
   *
   *
   * <pre>
   * Whether or not the response was validated with the origin server before
   * being served from cache. This field is only meaningful if `cache_hit` is
   * True.
   * </pre>
   *
   * <code>bool cache_validated_with_origin_server = 10;</code>
   *
   * @return The cacheValidatedWithOriginServer.
   */
  boolean getCacheValidatedWithOriginServer();

  /**
   *
   *
   * <pre>
   * The number of HTTP response bytes inserted into cache. Set only when a
   * cache fill was attempted.
   * </pre>
   *
   * <code>int64 cache_fill_bytes = 12;</code>
   *
   * @return The cacheFillBytes.
   */
  long getCacheFillBytes();

  /**
   *
   *
   * <pre>
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * </pre>
   *
   * <code>string protocol = 15;</code>
   *
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   *
   *
   * <pre>
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * </pre>
   *
   * <code>string protocol = 15;</code>
   *
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString getProtocolBytes();
}
