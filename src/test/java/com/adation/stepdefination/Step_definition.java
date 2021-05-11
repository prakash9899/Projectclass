package com.adation.stepdefination;

import org.openqa.selenium.interactions.SendKeysAction;

import Base_class.Base;
import Base_class.Login_page;
import Base_class.Pom_Page2;
import Base_class.Pom_Page3;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition extends Base{
	Login_page page = new Login_page(driver);
Pom_Page2 page2 = new Pom_Page2(driver);
Pom_Page3 page3= new Pom_Page3(driver);
	@Given("^user launch the Application$")
public void user_launch_the_Application() throws Throwable {
	openurl("https://adactinhotelapp.com/");
}                         
@When("^user enter the username Field$")
public void user_enter_the_username_Field() throws Throwable {
	inputvalue(page.getUserid(), "prakash9899");
}

@When("^enter the Passward field$")
public void enter_athe_Passward_field() throws Throwable {
inputvalue(page.getPasswd(), "9884690243p");
}

@Then("^click on Logion button and it Navigate to search hotel page$")
public void click_on_Logion_button_and_it_Navigate_to_search_hotel_page() throws Throwable {
clickonelement(page.getLogin());
}
@When("^user Select location in Field$")
public void user_Select_location_in_Field() throws Throwable {
	byvisibletext(page.getLocation(),"London");
	
}

@When("^user Select Hotel In Field$")
public void user_Select_Hotel_In_Field() throws Throwable {
byvisibletext(page.getHotel(), "Hotel Sunshine");
	
}

@When("^user room Type In Field$")
public void user_room_Type_In_Field() throws Throwable {
byvisibletext(page.getRoomtype(), "Double");

}
@When("^user number of roon in field$")
public void user_number_of_roon_in_field() throws Throwable {
	byvalue(page.getNumberofroom(),"4");
}


@When("^user Chick In Date In Field$")
public void user_Chick_In_Date_In_Field() throws Throwable {
	inputvalue(page.getCheeckindate(), "15/7/2021");

}

@When("^user chick out date in Field$")
public void user_chick_out_date_in_Field() throws Throwable {
	inputvalue(page.getCheckout(), "17/7/2021");
}

@When("^user adults select in field$")
public void user_adults_select_in_field() throws Throwable {
byvalue(page.getAdultnumber(), "2");
}

@Then("^click on search and it navigate to select hotel page$")
public void click_on_search_and_it_navigate_to_select_hotel_page() throws Throwable {
clickonelement(page.getSearch());
}

@When("^user selecet the button in Field$")
public void user_selecet_the_button_in_Field() throws Throwable {

	movetoelement(page2.getButton());
}

@Then("^click on continue and it navigate to book a hotel page$")
public void click_on_continue_and_it_navigate_to_book_a_hotel_page() throws Throwable {
clickonelement(page2.getContine());
}
@When("^user select name in Field$")
public void user_select_name_in_Field() throws Throwable {
inputvalue(page3.getName(), "prakash");

}

@When("^user select last name in Field$")
public void user_select_last_name_in_Field() throws Throwable {
inputvalue(page3.getLastname(), "p");
}

@When("^user give address in Field$")
public void user_give_address_in_Field() throws Throwable {
inputvalue(page3.getAddres(), "No:8/3 venkatachalam street pazhavanthagal");
}

@When("^user give card number in Field$")
public void user_give_card_number_in_Field() throws Throwable {
inputvalue(page3.getCriednumber(), "1234567891234567");
}

@When("^user select card type in Field$")
public void user_select_card_type_in_Field() throws Throwable {
byvisibletext(page3.getCardtype(), "VISA");
}

@When("^user select datein Field$")
public void user_select_datein_Field() throws Throwable {
byvalue(page3.getExpmonth(), "11");
}

@When("^user select year in Field$")
public void user_select_year_in_Field() throws Throwable {
byvisibletext(page3.getExpyr(), "2021");
}

@When("^user give the cvv number in Field$")
public void user_give_the_cvv_number_in_Field() throws Throwable {
	inputvalue(page3.getCvvnumber(), "236");
}

@Then("^click in booknow and navigate tobooking conformation page$")
public void click_in_booknow_and_navigate_tobooking_conformation_page() throws Throwable {
clickonelement(page3.getBooknow());
Thread.sleep(4000);
}
@When("^user click on my itrineryin Field$")
public void user_click_on_my_itrineryin_Field() throws Throwable {
	Thread.sleep(4000);
clickonelement(page3.getMyitation());
}

@Then("^clickin logout page and navigate to home page$")
public void clickin_logout_page_and_navigate_to_home_page() throws Throwable {
	Thread.sleep(5000);
	clickonelement(page3.getLagout());
}
}
