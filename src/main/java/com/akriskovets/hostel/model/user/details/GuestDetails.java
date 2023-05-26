package com.akriskovets.hostel.model.user.details;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "guest_details")
public class GuestDetails {

    @Id
    @Column(name = "guest_details_id")
    private Long id;

    @Column(name = "passport")
    private String passport;
}
