package com.akriskovets.hostel.model.user.details;

import com.akriskovets.hostel.model.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "guest_details")
public class GuestDetails {

    @Id
    @Column(name = "guest_details_id")
    private Long id;

    @Column(name = "passport")
    private String passport;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
