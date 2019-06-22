import com.employee.Employee;
import com.util.Helper;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("kiyan");
        emp.setSalary(10.00);
        System.out.println(new ObjectMapper().writeValueAsString(emp));


        Employee e = new ObjectMapper().readValue(new ObjectMapper().writeValueAsString(emp),Employee.class);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
