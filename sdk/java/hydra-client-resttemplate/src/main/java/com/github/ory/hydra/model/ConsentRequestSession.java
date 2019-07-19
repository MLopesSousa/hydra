/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ConsentRequestSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T19:30:59.329+02:00")
public class ConsentRequestSession {
  @JsonProperty("access_token")
  private Map<String, Object> accessToken = null;

  @JsonProperty("id_token")
  private Map<String, Object> idToken = null;

  public ConsentRequestSession accessToken(Map<String, Object> accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public ConsentRequestSession putAccessTokenItem(String key, Object accessTokenItem) {
    if (this.accessToken == null) {
      this.accessToken = new HashMap<String, Object>();
    }
    this.accessToken.put(key, accessTokenItem);
    return this;
  }

   /**
   * AccessToken sets session data for the access and refresh token, as well as any future tokens issued by the refresh grant. Keep in mind that this data will be available to anyone performing OAuth 2.0 Challenge Introspection. If only your services can perform OAuth 2.0 Challenge Introspection, this is usually fine. But if third parties can access that endpoint as well, sensitive data from the session might be exposed to them. Use with care!
   * @return accessToken
  **/
  @ApiModelProperty(value = "AccessToken sets session data for the access and refresh token, as well as any future tokens issued by the refresh grant. Keep in mind that this data will be available to anyone performing OAuth 2.0 Challenge Introspection. If only your services can perform OAuth 2.0 Challenge Introspection, this is usually fine. But if third parties can access that endpoint as well, sensitive data from the session might be exposed to them. Use with care!")
  public Map<String, Object> getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(Map<String, Object> accessToken) {
    this.accessToken = accessToken;
  }

  public ConsentRequestSession idToken(Map<String, Object> idToken) {
    this.idToken = idToken;
    return this;
  }

  public ConsentRequestSession putIdTokenItem(String key, Object idTokenItem) {
    if (this.idToken == null) {
      this.idToken = new HashMap<String, Object>();
    }
    this.idToken.put(key, idTokenItem);
    return this;
  }

   /**
   * IDToken sets session data for the OpenID Connect ID token. Keep in mind that the session&#39;id payloads are readable by anyone that has access to the ID Challenge. Use with care!
   * @return idToken
  **/
  @ApiModelProperty(value = "IDToken sets session data for the OpenID Connect ID token. Keep in mind that the session'id payloads are readable by anyone that has access to the ID Challenge. Use with care!")
  public Map<String, Object> getIdToken() {
    return idToken;
  }

  public void setIdToken(Map<String, Object> idToken) {
    this.idToken = idToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestSession consentRequestSession = (ConsentRequestSession) o;
    return Objects.equals(this.accessToken, consentRequestSession.accessToken) &&
        Objects.equals(this.idToken, consentRequestSession.idToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, idToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequestSession {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

