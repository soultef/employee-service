package com.soultech.employee_service.DTO;

import java.util.Date;

public class EmployeeDTO {
      private String fullName;
      private String email;
      private String phone;
      private Long department_id;
      private String ssn;
      private Date birth_date;
      private Date hire_date;
      private String gender;
      private double salary;
      private String job_title;

      public String getFullName() {
            return fullName;
      }

      public void setFullName(String fullName) {
            this.fullName = fullName;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getPhone() {
            return phone;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }

      public Long getDepartment_id() {
            return department_id;
      }

      public void setDepartment_id(Long department_id) {
            this.department_id = department_id;
      }

      public String getSsn() {
            return ssn;
      }

      public void setSsn(String ssn) {
            this.ssn = ssn;
      }

      public Date getBirth_date() {
            return birth_date;
      }

      public void setBirth_date(Date birth_date) {
            this.birth_date = birth_date;
      }

      public Date getHire_date() {
            return hire_date;
      }

      public void setHire_date(Date hire_date) {
            this.hire_date = hire_date;
      }

      public String getGender() {
            return gender;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }

      public double getSalary() {
            return salary;
      }

      public void setSalary(double salary) {
            this.salary = salary;
      }

      public String getJob_title() {
            return job_title;
      }

      public void setJob_title(String job_title) {
            this.job_title = job_title;
      }
}
