package gun03;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class StepdefsGun03 {


    @Given("my list {int}")
    public void myList(int num, DataTable dataTable) {
        List<Integer> list = dataTable.asList(Integer.class);

        System.out.println(num);
        System.out.println(list);

        for (Integer s : list) {
            System.out.println(s + " : " + (s*s));
        }


    }

    @Then("conclution")
    public void conclution() {
    }

    @Given("my lists, list of list")
    public void myListsListOfList(DataTable table) {
        List<List<Integer>> lists = table.asLists(Integer.class);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }


    @Given("my map")
    public void myMap(DataTable table) {
        Map<String, Integer> map = table.asMap(String.class, Integer.class);

        System.out.println(map);
        System.out.println(map.get("key1"));
    }
}
