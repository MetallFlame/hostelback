package com.akriskovets.hostel.model.user.details.mployee;

import com.akriskovets.hostel.model.Room;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "employee_details")
public class EmployeeDetails {

    @Id
    @Column(name = "empl_details_id")
    private Long id;

    private List<Room> rooms;

    @Column(name = "position")
    private Position position;
}
