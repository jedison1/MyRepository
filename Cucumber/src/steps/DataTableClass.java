package steps;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;




public class DataTableClass {
	String name;
	int age;
	String city;
	
	@Given("the data to print")
	public void the_data_to_print(DataTable dataTable) {
		List<List<String>> data=dataTable.asLists();
		for(int i=1;i<data.size();i++) {
		name=data.get(i).get(0);
	   age=Integer.parseInt(data.get(i).get(1));
		}
	}

	@When("city is added")
	public void city_is_added(DataTable dataTable) {
		List<List<String>> data=dataTable.asLists();
		city=data.get(1).get(0);
	}

	@Then("print the values")
	public void print_the_values() {
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(city);
	}

}
