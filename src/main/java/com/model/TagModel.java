package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagModel {

   @JsonProperty("name")
   private String name;
   @JsonProperty("id")
   private int id;

   public TagModel() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

}
