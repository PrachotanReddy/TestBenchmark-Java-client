package abc;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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
  private final String ACTIVITY = "com.abc.abcnews.ui.StartActivity";
  private final String PACKAGE = "com.abc.abcnews";
  private final String DEVICE = "emulator-5554";
  private final String PLATFORM = "Android";
  private final String SERVER = "http://localhost:4723";
  private final String autoName ="UIAutomator2";

  @BeforeSuite
  public void setUp() throws IOException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("deviceName", DEVICE);
    capabilities.setCapability("platformName", PLATFORM);
    capabilities.setCapability("appPackage", PACKAGE);
    capabilities.setCapability("appActivity", ACTIVITY);
    capabilities.setCapability("automationName",autoName);
    driver = new AndroidDriver<WebElement>(new URL(SERVER), capabilities);
  }

  @AfterClass
  public void tearDown() {
      driver.quit();
  }

  @BeforeMethod
  public void reset() {
      driver.resetApp();
  }

  // @Test
  // public void testSignIn() {
  //   //pop not detected by appium, abort
  // }

  // @Test
  // public void testSignUp() {
  //   //class androidx.appcompat.app.ActionBar$Tab
  //   //activity .ui.navigation.MainNavigationActivity
  //   AndroidElement category = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[2]");
  //   category.click();
  //   //class android.widget.RelativeLayout
  //   //activity .ui.navigation.MainNavigationActivity
  //   AndroidElement home_signin_or_signup = (AndroidElement) driver.findElementById("com.abc.abcnews:id/login_banner");
  //   home_signin_or_signup.click();
  //   //pop not detected by appium, abort
  // }

  @Test
  public void testSearch() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //class android.widget.EditText
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.abc.abcnews:id/drawer_search");
    Thread.sleep(15000);
    search_bar.sendKeys("sanders feels the heat\n");
    //activity .ui.SearchActivity
  }

  @Test
  public void testDetail() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //class android.widget.EditText
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.abc.abcnews:id/drawer_search");
    search_bar.sendKeys("sanders feels the heat\n");
    //class android.widget.LinearLayout
    //activity .ui.SearchActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    item_1.click();
    //activity .ui.NewsItemActivity
  }

  @Test
  public void testAddBookmark() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //class android.widget.EditText
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.abc.abcnews:id/drawer_search");
    search_bar.sendKeys("sanders feels the heat\n");
    //class android.widget.LinearLayout
    //activity .ui.SearchActivity
    Thread.sleep(15000);
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    item_1.click();
    //class android.widget.TextView
    //activity .ui.NewsItemActivity
    Thread.sleep(15000);
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.abc.abcnews:id/menu_save_button");
    save_bookmark.click();
    //activity .ui.NewsItemActivity
  }

  @Test
  public void testRemoveBookmark() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //class android.widget.EditText
    //activity .ui.navigation.MainNavigationActivity

    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.abc.abcnews:id/drawer_search");
    search_bar.sendKeys("sanders feels the heat\n");
    Thread.sleep(15000);
    //class android.widget.LinearLayout
    //activity .ui.SearchActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    item_1.click();
    //class android.widget.TextView
    //activity .ui.NewsItemActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.abc.abcnews:id/menu_save_button");
    save_bookmark.click();
    //class android.widget.ImageButton
    //activity .ui.NewsItemActivity
    AndroidElement back = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    back.click();

    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    menu.click();
    //class android.view.ViewGroup
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement menu_bookmark = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.view.ViewGroup[2]");
    menu_bookmark.click();
    //class android.view.ViewGroup
    //activity .ui.navigation.MainNavigationActivity
    item_1 = (AndroidElement) driver.findElementById("com.abc.abcnews:id/headline_list_item_parent_container");
    item_1.click();
    //class android.widget.TextView
    //activity .ui.NewsItemPagerActivity
    AndroidElement remove_bookmark = (AndroidElement) driver.findElementById("com.abc.abcnews:id/menu_save_button");
    remove_bookmark.click();
    //activity .ui.NewsItemPagerActivity
  }

  // @Test
  // public void testAccount() {
  //   //functionality not present
  // }

  @Test
  public void testTextSize() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //class android.widget.RelativeLayout
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout");
    menu_settings.click();
    Thread.sleep(15000);
    //class android.widget.LinearLayout
    //activity .ui.SettingsActivity
    AndroidElement menu_textsize = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    menu_textsize.click();
    Thread.sleep(15000);
    //class android.widget.CheckedTextView
    //activity .ui.SettingsActivity
    AndroidElement change_textsize = (AndroidElement) driver.findElementById("android:id/text1");
    change_textsize.click();
    Thread.sleep(15000);
    //activity .ui.SettingsActivity
  }

  // @Test
  // public void testAbout() {
  //   //functionality not present
  // }

  @Test
  public void testCategory() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //class android.view.ViewGroup
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.view.ViewGroup[1]");
    cat_1.click();
    //activity .ui.navigation.MainNavigationActivity
  }

  @Test
  public void testContact() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    Thread.sleep(15000);
    //class android.widget.RelativeLayout
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout");
    menu_settings.click();
    Thread.sleep(15000);
    //class android.widget.TextView
    //activity .ui.SettingsActivity
    AndroidElement contact = (AndroidElement) driver.findElementById("com.abc.abcnews:id/setting_feedback");
    contact.click();
    //activity .ui.WebViewActivity
  }

  // @Test
  // public void testHelp() {
  //   //functionality not present
  // }

  @Test
  public void testMenu() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    //activity .ui.navigation.MainNavigationActivity
  }

  @Test
  public void testTerms() throws InterruptedException {
    //class android.widget.ImageButton
    //activity .ui.navigation.MainNavigationActivity
    Thread.sleep(15000);
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]");
    menu.click();
    Thread.sleep(15000);
    //class android.widget.RelativeLayout
    //activity .ui.navigation.MainNavigationActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout");
    menu_settings.click();
    Thread.sleep(15000);
    //class android.widget.TextView
    //activity .ui.SettingsActivity
    AndroidElement legal = (AndroidElement) driver.findElementById("com.abc.abcnews:id/setting_terms");
    legal.click();
    //activity .ui.WebViewActivity
  }
}
