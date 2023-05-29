package com.akriskovets.hostel.model.user.details.employee;

import com.akriskovets.hostel.model.Room;
import com.akriskovets.hostel.model.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "employee_details")
public class EmployeeDetails {

    @Id
    @Column(name = "employee_details_id")
    private Long id;

    @OneToMany(mappedBy="employeeDetails")
    private List<Room> rooms;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="position_id")
    private Position position;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
