package com.javatechie.util;

import com.javatechie.dto.EmployeeDTO;
import com.javatechie.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder {

    public static List<EmployeeDTO> getListDTO() {
        return Arrays.asList(new EmployeeDTO(1,"anuragkngr","Manager","Anurag", "Mishra", "Anurag Kumar Mishra", "AKM12345", "India", 9811000000D, "anuragkngr@gmail.com", "Delivery", 1400000D),
                new EmployeeDTO(2,"melodymadhu","Manager","Archana", "Mishra", "Archana Mishra", "MLD11111", "Canada", 9311040188D, "melodymadhu20@gmail.com", "Human Resource", 1550000D));
    }

    public static List<Employee> getListEntities() {
        return Arrays.asList(new Employee(1,"anuragkngr","Manager","Anurag", "Mishra", "Anurag Kumar Mishra", "AKM12345", "India", 9811000000D, "anuragkngr@gmail.com", "Delivery", 1400000D),
                new Employee(1,"melodymadhu","Manager","Archana", "Mishra", "Archana Mishra", "MLD11111", "Canada", 9311040188D, "melodymadhu20@gmail.com", "Human Resource", 1550000D));
    }

    public static EmployeeDTO getDTO() {
        return new EmployeeDTO(1,"anuragkngr","Manager","Anurag", "Mishra", "Anurag Kumar Mishra", "AKM12345", "India", 9811000000D, "anuragkngr@gmail.com", "Delivery", 1400000D);
    }

    public static Employee getEntity() {
        return new Employee(1,"anuragkngr","Manager","Anurag", "Mishra", "Anurag Kumar Mishra", "AKM12345", "India", 9811000000D, "anuragkngr@gmail.com", "Delivery", 1400000D);
    }
}
