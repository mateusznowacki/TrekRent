package pl.pwr.trekrentbackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import pl.pwr.trekrentbackend.enums.UserGroup;


import java.util.List;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;
    private String phoneNumber;

    @Email
    private String email;

    @Size(max = 11)
    private String PESEL;

    private String address;
    private String password;

    @NotBlank
    @Size(max = 100)
    private String username;

    @NotNull
    @Enumerated(EnumType.STRING)
    private UserGroup userGroup;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Rental> rentals;

}
