package com;

import com.controller.Controller;
import com.model.PetModel;
import com.model.PetNotFoundModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Map;

public class MainTest {

    private PetModel testPet;
    private Controller controller;

    @BeforeTest
    public void createPetModel(){
        int testPetId = Integer.valueOf(RandomStringUtils.randomNumeric(5));
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        testPet = new PetModel(testPetId, testPetName, null, new ArrayList<>(), new ArrayList<>(), "Available");
        controller = new Controller();
    }
    @Test
    public void verifyAddNewPetTest(){
        PetModel petResponse = controller.postNewPet(testPet);
        Assert.assertEquals(petResponse,testPet);
    }

    @Test
    public void verifyDeletePetTest(){
        PetNotFoundModel expectedResponse = new PetNotFoundModel(1,"error","Pet not found");
        PetModel petResponse = controller.postNewPet(testPet);
        Assert.assertEquals(petResponse,testPet);
        controller.deletePetById(testPet.getId());
        PetNotFoundModel actualResponse = (PetNotFoundModel) controller.getPetById(testPet.getId());
        Assert.assertEquals(actualResponse,expectedResponse);
    }

    @Test
    public void verifyUpdatePetTest() {
        controller.postNewPet(testPet);
        testPet.setName("Bob");
        PetModel petResponse = controller.updatePet(testPet);
        Assert.assertEquals(petResponse,testPet);
    }
}
