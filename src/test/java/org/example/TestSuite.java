package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();

    ElectronicsPage electronicsPage = new ElectronicsPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new
            LeicaTMirrorlessDigitalCameraPage();
    CartPage cartPage = new CartPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter registeration details to fill form
        registerPage.enterRegistrationDetails();

        //verify user registered successfully or not
        registerResultPage.verifyUserRegisteredSuccessfully();


    }
    @Test
    public void verifyUserShouldBeAbleToReferAProductToFriendSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();

        //enter register details
        registerPage.enterRegistrationDetails();

        //click on login
        homePage.clickOnLogin();

        //enter login details
        loginPage.fillInLoginDetails();

        //click on build your own computer
        homePage.clickOnBuildYourOwnComputer();

        //click on email a friend
        buildYourOwnComputerPage.emailAFriend();

        //type friend's email ,personal msg and click on send email button
        productEmailAFriendPage.fillInEmailAFriendDetailsRegisteredUser();


    }
    @Test
    public void VerifyRegisteredUserShouldBeAbleToVoteSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();

        //enter register details
        registerPage.enterRegistrationDetails();

        //click on login
        homePage.clickOnLogin();

        //enter login detais
        loginPage.fillInLoginDetails();

        //click on good radio button
        homePage.clickOnGoodRadioButton();

        //click on vote button
        homePage.clickOnVoteButton();

       // verify message
        homePage.verifyRegisteredUserShouldBeAbleToVoteSuccessfully();


    }
    @Test
    public void VerifyUserShouldBeAbleToCompare2Products(){
        //click on hts mobile compare button
        homePage.clickOnHTCAndroidCompareButton();

        //click on green notification bar
        homePage.clickToCloseGreenBar();

        //click on 25$virtual gift card compare button
        homePage.clickOn25$VirtualGiftCardCompareButton();

        //click on green notification bar
        homePage.clickToCloseGreenBar();

        //click on comparision products text on green notification bar
        homePage.clickOnProductComparisionText();

        //steps on compare products page
        compareProductsPage.productComparisionPage();



    }
    @Test
    public void verifyNonRegisteredUserShouldNotBeAbleToEmailFriend(){

        //click on add to cart button of build your own computer
        homePage.clickOnAddToCartBuildYourOwnComputer();

        //click on email a friend button
        buildYourOwnComputerPage.emailAFriend();

        //fill in details on email a friend as non registered user
        productEmailAFriendPage.fillInEmailAFriendDetailsNonRegisteredUser();

    }
    @Test
    public void verifyNonRegisteredUserShouldNotBeAbleToVote(){

        //click on good radio button
        homePage.clickOnGoodRadioButton();

        //click on vote
        homePage.clickOnVoteButton();

        //verify and print error message
        homePage.verifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully();


    }
    @Test
    public void verifyUserShouldBeAbleToSeeProductsInShoppingCartSuccessfully(){

        //click on Electronics
        homePage.clickOnElectronics();

        //click on camera & photo image
        electronicsPage.clickOnCameraAndPhoto();

        //click on Leica camera
        cameraAndPhotoPage.clickOnLeicaCamera();

        //get leica camera text
        leicaTMirrorlessDigitalCameraPage.leicaCameraAddToCartAndShoppingCart();

        // to compare product name matched or not in shopping cart
        cartPage.compareProductNameInCart();




    }


}
