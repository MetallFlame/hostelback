package com.akriskovets.hostel.model.user;

import com.akriskovets.hostel.model.user.details.employee.EmployeeDetails;
import jakarta.persistence.*;
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

    @OneToOne(fetch = FetchType.LAZY)
    private EmployeeDetails employeeDetails;

    @Column(name = "user_role")
    private UserRole userRole;

    @Column(name = "passport")
    private String passport;
}
