package com.javatechie.mapper;

import com.javatechie.dto.EmployeeDTO;
import com.javatechie.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-22T23:17:05+0530",
    comments = "version: 1.6.0.RC1, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO asDTO(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId( entity.getId() );
        employeeDTO.setUserName( entity.getUserName() );
        employeeDTO.setDesignation( entity.getDesignation() );
        employeeDTO.setFirstName( entity.getFirstName() );
        employeeDTO.setLastName( entity.getLastName() );
        employeeDTO.setFullName( entity.getFullName() );
        employeeDTO.setEmployeeCode( entity.getEmployeeCode() );
        employeeDTO.setRegion( entity.getRegion() );
        employeeDTO.setPhone( entity.getPhone() );
        employeeDTO.setEmail( entity.getEmail() );
        employeeDTO.setDepartment( entity.getDepartment() );
        employeeDTO.setSalary( entity.getSalary() );

        return employeeDTO;
    }

    @Override
    public List<Employee> asEntityList(List<EmployeeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( dtoList.size() );
        for ( EmployeeDTO employeeDTO : dtoList ) {
            list.add( asEntity( employeeDTO ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDTO> asDTOList(List<Employee> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( entityList.size() );
        for ( Employee employee : entityList ) {
            list.add( asDTO( employee ) );
        }

        return list;
    }

    @Override
    public Employee asEntity(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setUserName( dto.getUserName() );
        employee.setDesignation( dto.getDesignation() );
        employee.setFirstName( dto.getFirstName() );
        employee.setLastName( dto.getLastName() );
        employee.setFullName( dto.getFullName() );
        employee.setEmployeeCode( dto.getEmployeeCode() );
        employee.setRegion( dto.getRegion() );
        employee.setPhone( dto.getPhone() );
        employee.setEmail( dto.getEmail() );
        employee.setDepartment( dto.getDepartment() );
        employee.setSalary( dto.getSalary() );

        return employee;
    }
}
