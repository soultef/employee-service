package com.soultech.employee_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soultech.employee_service.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>, JpaSpecificationExecutor<EmployeeEntity> {
}
