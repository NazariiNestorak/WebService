package com.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PetModel{

   @JsonProperty("id")
   private Integer id;
   @JsonProperty("name")
   private String name;
   @JsonProperty("category")
   private CategoryModel category;
   @JsonProperty("photoUrls")
   private List<String> photoUrls;
   @JsonProperty("tags")
   private List<TagModel> tags;
   @JsonProperty("status")
   private String status;

   public PetModel(){
   }

   public PetModel(Integer id, String name, CategoryModel category, List<String> photoUrls, List<TagModel> tags, String status) {
      this.id = id;
      this.name = name;
      this.category = category;
      this.photoUrls = photoUrls;
      this.tags = tags;
      this.status = status;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public CategoryModel getCategory() {
      return category;
   }

   public void setCategory(CategoryModel category) {
      this.category = category;
   }

   public List<String> getPhotoUrls() {
      return photoUrls;
   }

   public void setPhotoUrls(List<String> photoUrls) {
      this.photoUrls = photoUrls;
   }

   public List<TagModel> getTags() {
      return tags;
   }

   public void setTags(List<TagModel> tags) {
      this.tags = tags;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      PetModel petModel = (PetModel) o;
      return Objects.equals(id, petModel.id) &&
            Objects.equals(name, petModel.name) &&
            Objects.equals(category, petModel.category) &&
            Objects.equals(photoUrls, petModel.photoUrls) &&
            Objects.equals(tags, petModel.tags) &&
            Objects.equals(status, petModel.status);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, category, photoUrls, tags, status);
   }

   @Override
   public String toString() {
      return "PetModel{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", category=" + category +
            ", photoUrls=" + photoUrls +
            ", tags=" + tags +
            ", status='" + status + '\'' +
            '}';
   }

}
