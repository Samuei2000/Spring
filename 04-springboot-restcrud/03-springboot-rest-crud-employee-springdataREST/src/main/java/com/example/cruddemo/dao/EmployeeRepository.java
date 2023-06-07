package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
//expose "members" for this given REST repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //no need to write any code here!
}
