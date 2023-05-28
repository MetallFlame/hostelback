package com.akriskovets.hostel.model.user.details.mployee;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "positions")
public class Position {

    @Id
    @Column(name = "position_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "salary")
    private Long salary;

}
