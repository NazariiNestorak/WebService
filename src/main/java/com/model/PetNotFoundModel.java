package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PetNotFoundModel{

   @JsonProperty("code")
   private Integer code;
   @JsonProperty("type")
   private String type;
   @JsonProperty("message")
   private String message;

   public PetNotFoundModel(Integer code, String type, String message) {
      this.code = code;
      this.type = type;
      this.message = message;
   }

   public PetNotFoundModel() {
   }

   public Integer getCode() {
      return code;
   }

   public void setCode(Integer code) {
      this.code = code;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      PetNotFoundModel that = (PetNotFoundModel) o;
      return Objects.equals(code, that.code) &&
            Objects.equals(type, that.type) &&
            Objects.equals(message, that.message);
   }

   @Override
   public int hashCode() {
      return Objects.hash(code, type, message);
   }

   @Override
   public String toString() {
      return "PetNotFoundModel{" +
            "code=" + code +
            ", type='" + type + '\'' +
            ", message='" + message + '\'' +
            '}';
   }

}
