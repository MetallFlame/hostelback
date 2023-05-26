package com.akriskovets.hostel.model.user;

import com.akriskovets.hostel.model.user.details.mployee.EmployeeDetails;
import com.akriskovets.hostel.model.user.details.GuestDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "employee_details")
    private EmployeeDetails employeeDetails;

    @Column(name = "guest_details")
    private GuestDetails guestDetails;

    @Column(name = "user_role")
    private UserRole userRole;
}
