package com.testData;

import com.google.common.collect.ImmutableMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class RequestSpecDataReader {

   private static Properties properties = new Properties();

   static {
      try(FileInputStream inputStream = new FileInputStream("src/main/resources/requestSpec.properties")) {
         properties.load(inputStream);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static String getBaseUri() {
      return properties.getProperty("requestSpec.baseUri");
   }

   public static String getBasePath(){
      return properties.getProperty("requestSpec.basePath");
   }

   public static Map<String, String> getBaseHeader() {
       return ImmutableMap.of("requestSpec.baseHeaderName", "requestSpec.baseHeaderValue");
   }
}
