package com.akriskovets.hostel.model.user.details.mployee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
