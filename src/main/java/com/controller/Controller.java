package com.controller;

import com.model.PetModel;
import com.model.PetNotFoundModel;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static com.testData.RequestSpecDataReader.*;
import static io.restassured.RestAssured.given;

public class Controller {

   public Controller() {
      RestAssured.requestSpecification = new RequestSpecBuilder()
              .setBaseUri(getBaseUri())
              .setBasePath(getBasePath())
              .addHeaders(getBaseHeader())
              .log(LogDetail.ALL)
              .setContentType(ContentType.JSON).build();
   }

   public PetModel postNewPet(PetModel pet) {
      return given().body(pet)
              .when().post()
              .then()
              .extract()
              .response()
              .as(PetModel.class);
   }

   public void deletePetById(int petId) {
      given().delete(String.valueOf(petId));
   }

   public Object getPetById(int petId) {
      Response response = given().get(String.valueOf(petId));
      if (response.statusCode() == 200) {
         return response.as(PetModel.class);
      } else {
         return response.as(PetNotFoundModel.class);
      }
   }

   public PetModel updatePet(PetModel pet) {
      return given()
              .body(pet)
              .put().as(PetModel.class);
   }

}
