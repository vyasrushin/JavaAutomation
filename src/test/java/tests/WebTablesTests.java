package tests;

import base.BaseTest;
import tsestpages.WebTablePagefsfd;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utils.TestDataUtil;

@Listeners(listeners.TestListener.class)
public class WebTablesTests extends BaseTest {

    @Test(priority = 1)
    public void testAddAndValidateRecord() {
        WebTablePagefsfd page = new WebTablePagefsfd(driver);
        String email = "john.doe@test.com";

        page.clickAddButton();
        page.fillForm("John", "Doe", email, "30", "5000", "QA");
        page.submitForm();

        Assert.assertTrue(page.isRecordPresent(email));
    }

    @Test(priority = 2)
    public void testEditRecord() {
        WebTablePagefsfd page = new WebTablePagefsfd(driver);
        String email = "john.doe@test.com";
        String newDepartment = "Development";

        page.clickEditButton(email);
        page.fillForm("John", "Doe", email, "30", "5000", newDepartment);
        page.submitForm();

        Assert.assertTrue(page.isRecordPresent(email)); // Just validation here
    }

    @Test(priority = 3)
    public void testDeleteRecord() {
        WebTablePagefsfd page = new WebTablePagefsfd(driver);
        String email = "john.doe@test.com";

        page.clickDeleteButton(email);

        Assert.assertFalse(page.isRecordPresent(email));
    }

    @Test(priority = 4, dataProvider = "recordData")
    public void testDataDrivenValidation(String firstName, String lastName, String email, String age, String salary, String department) {
        WebTablePagefsfd page = new WebTablePagefsfd(driver);
        page.clickAddButton();
        page.fillForm(firstName, lastName, email, age, salary, department);
        page.submitForm();

        Assert.assertTrue(page.isRecordPresent(email));
    }

    @DataProvider(name = "recordData")
    public Object[][] getData() {
        return TestDataUtil.getTestData();
    }
}