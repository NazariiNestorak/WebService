package com.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryModel {

   @JsonProperty("name")
   private String name;
   @JsonProperty("id")
   private Integer id;

   public  CategoryModel(){ }

   public CategoryModel(String name, int id) {
      this.name = name;
      this.id = id;
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

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      CategoryModel that = (CategoryModel) o;
      return Objects.equals(name, that.name) &&
            Objects.equals(id, that.id);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, id);
   }

   @Override
   public String toString() {
      return "{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
   }

}
