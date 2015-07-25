package actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import model.Employee;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.util.SubsetIteratorFilter.Decider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Oleg Romanenchuk
 */

@org.apache.struts2.convention.annotation.Action(value = "home")
@Namespace(value = "/")
@ResultPath(value = "/")
@Result(name = "success", location = "home.jsp")
public class HomeAction implements Action, ModelDriven<Employee>{
    @Override
    public String execute() throws Exception {
        employee.setId(100);
        employee.setRole("Java Developer");

        List<String> cities = new ArrayList<>();
        cities.add("Kharkov");
        cities.add("Saint Petersburg");
        cities.add("Gdansk");
        cities.add("Birmingham");
        employee.getCitiesList(cities);

        List<String> countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("Russia");
        countries.add("Poland");
        countries.add("Great Britain");
        employee.setCountryList(countries);

        Map<String, String> props = new HashMap<>();
        props.put("salary", "1000$");
        props.put("group", "open source team member");
        props.put("company", "freelance");
        props.put("age", "25 years");
        employee.setPropertiesMap(props);

        return SUCCESS;
    }

    public Decider getCountryDecider(){
        return new Decider() {
            @Override
            public boolean decide(Object o) throws Exception {
                String input = (String)o;
                if (input.equalsIgnoreCase("Ukraine"))
                return false;
                else
                    return true;
            }
        };
    }

    private Employee employee = new Employee();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    @Override
    public Employee getModel() {
        return employee;
    }

}
