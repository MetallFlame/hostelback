package com.akriskovets.hostel.model;

import com.akriskovets.hostel.model.user.details.mployee.EmployeeDetails;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "rooms")
public class Room {

    @Id
    @Column(name = "room_id")
    private Long id;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="empl_details_id")
    private EmployeeDetails employeeDetails;
}
