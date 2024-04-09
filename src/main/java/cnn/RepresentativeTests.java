package cnn;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

public class RepresentativeTests {

  private AndroidDriver<WebElement> driver;
  private final String DEVICE = "emulator-5554";
  private final String PLATFORM = "Android";
  private final String SERVER = "http://localhost:4723";
  private final String autoName ="UIAutomator2";

  private final String ACTIVITY = "com.cnn.mobile.android.phone.features.splash.SplashActivity";
  private final String PACKAGE = "com.cnn.mobile.android.phone";
  @BeforeSuite
  public void setUp() throws IOException {
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("deviceName", DEVICE);
      capabilities.setCapability("platformName", PLATFORM);
      capabilities.setCapability("appPackage", PACKAGE);
      capabilities.setCapability("appActivity", ACTIVITY);
      capabilities.setCapability("automationName",autoName);
    capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
      driver = new AndroidDriver<WebElement>(new URL(SERVER), capabilities);
  }

  @AfterClass
  public void tearDown() {
      driver.quit();
  }

  @BeforeMethod
  public void reset() throws InterruptedException {
      driver.resetApp();
      Thread.sleep(5000);
    AndroidElement edition=(AndroidElement)driver.findElementByXPath("//android.widget.ScrollView/android.view.View[1]/android.view.View[1]/android.widget.RadioButton");
    edition.click();
    AndroidElement next=(AndroidElement)driver.findElementByXPath("//android.widget.Button");
    next.click();
    Thread.sleep(500);
    AndroidElement skip=(AndroidElement)driver.findElementByXPath("//android.widget.TextView[@text=\"Skip (No Alerts)\"]");
    skip.click();
    Thread.sleep(500);
    AndroidElement agree=(AndroidElement)driver.findElementByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    agree.click();
    Thread.sleep(500);
  }

  // @Test
  // public void testSignIn() {
  //   //functionality not present
  // }

  // @Test
  // public void testSignUp() {
  //   //functionality not present
  // }

  @Test
  public void testSearch() throws InterruptedException {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity

    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/toolbar_search");
    tosearch.click();
    //class android.widget.EditText
    //activity .features.main.MainActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementByXPath("//android.widget.EditText");
    search_bar.sendKeys("llama\n");
    //activity .features.main.MainActivity
  }

  @Test
  public void testDetail() throws InterruptedException {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/toolbar_search");
    tosearch.click();
    //class android.widget.EditText
    //activity .features.main.MainActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementByXPath("//android.widget.EditText");
    search_bar.sendKeys("llama\n");
    //class android.view.ViewGroup
    //activity .features.main.MainActivity
    Thread.sleep(1000);
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    item_1.click();
    //activity .features.main.MainActivity
  }

  @Test
  public void testAddBookmark() {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/search_item_menu");
    tosearch.click();
    //class android.widget.EditText
    //activity .features.main.MainActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\" search text input\"]/android.widget.EditText");
    search_bar.sendKeys("llama\n");
    //class android.view.ViewGroup
    //activity .features.main.MainActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    item_1.click();
    //class android.widget.Button
    //activity .features.main.MainActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/toolbar_save");
    save_bookmark.click();
    //activity .features.main.MainActivity
  }

  @Test
  public void testRemoveBookmark() {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/search_item_menu");
    tosearch.click();
    //class android.widget.EditText
    //activity .features.main.MainActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\" search text input\"]/android.widget.EditText");
    search_bar.sendKeys("llama\n");
    //class android.view.ViewGroup
    //activity .features.main.MainActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
    item_1.click();
    //class android.widget.Button
    //activity .features.main.MainActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/toolbar_save");
    save_bookmark.click();
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement back = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/toolbar_back_button_container");
    back.click();
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement menu_bookmark = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/saved_story_item_menu");
    menu_bookmark.click();
    //class android.widget.ImageButton
    //activity .features.main.MainActivity
    AndroidElement remove_bookmark = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/deleteButton");
    remove_bookmark.click();
    //activity .features.main.MainActivity
  }

  @Test
  public void testAccount() {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/settings_item_menu");
    menu.click();
    //class android.widget.Button
    //activity .features.main.MainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/tv_tv_login");
    menu_account.click();
    //activity .features.watch.authentication.legacy.TvePickerPrimaryListActivity
  }

  // @Test
  // public void testTextSize() {
  //   //class android.widget.FrameLayout
  //   //activity .features.main.MainActivity
  //   AndroidElement menu = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/settings_item_menu");
  //   menu.click();
  //   //class android.widget.LinearLayout
  //   //activity .features.main.MainActivity
  //   AndroidElement menu_textsize = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/text_sizing_container");
  //   menu_textsize.click();
  //   //incomplete: uses strange unclickable elements for text size
  // }

  // @Test
  // public void testAbout() {
  //   //functionality not present
  // }

  @Test
  public void testCategory() {
    //class androidx.appcompat.app.a$c
    //activity .features.main.MainActivity
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("//androidx.appcompat.app.a.c[@content-desc=\"World\"]");
    cat_1.click();
    //activity .features.main.MainActivity
  }

  @Test
  public void testContact() {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/settings_item_menu");
    menu.click();
    //class android.widget.Button
    //activity .features.main.MainActivity
    AndroidElement contact = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/tv_feedback_link");
    contact.click();
    //activity com.apptentive.android.sdk.ApptentiveViewActivity
  }

  // @Test
  // public void testHelp() {
  //   //functionality not present
  // }

  @Test
  public void testMenu() {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/settings_item_menu");
    menu.click();
    //activity .features.main.MainActivity
  }

  @Test
  public void testTerms() {
    //class android.widget.FrameLayout
    //activity .features.main.MainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/settings_item_menu");
    menu.click();
    //class android.widget.Button
    //activity .features.main.MainActivity
    AndroidElement legal = (AndroidElement) driver.findElementById("com.cnn.mobile.android.phone:id/tv_terms_conditions");
    legal.click();
    //activity .features.main.MainActivity
  }
}
