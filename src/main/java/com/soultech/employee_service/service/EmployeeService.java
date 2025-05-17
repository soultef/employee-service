package com.soultech.employee_service.service;

import com.soultech.employee_service.DTO.EmployeeDTO;
import com.soultech.employee_service.entity.EmployeeEntity;
import com.soultech.employee_service.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    private EmployeeDTO employeeDtoMapper(EmployeeEntity employeeEntity) {
        EmployeeDTO empDto = new EmployeeDTO();
        String fullName = employeeEntity.getFirstName() + " " + employeeEntity.getLastName();
        empDto.setFullName(fullName);
        empDto.setEmail(employeeEntity.getEmail());
        empDto.setPhone(employeeEntity.getPhone());
        empDto.setBirth_date(employeeEntity.getBirthDate());
        empDto.setGender(employeeEntity.getGender());
        empDto.setDepartment_id(employeeEntity.getDepartment().getId());
        empDto.setBirth_date(employeeEntity.getBirthDate());
        empDto.setHire_date(employeeEntity.getHireDate());
        empDto.setSalary(employeeEntity.getSalary());
        empDto.setSsn(employeeEntity.getSsn());
        empDto.setJob_title(employeeEntity.getJobTitle());
        return empDto;
    }


    public Page<EmployeeDTO> getAllEmployees(Pageable pageable)
    {
        Page<EmployeeEntity> employees = employeeRepository.findAll(pageable);
        return employees.map(this::employeeDtoMapper);
    }


}
