package pl.pwr.TrekRent.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.pwr.TrekRent.enums.UserGroup;

import java.util.List;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String lastname;

    @NotNull
    private String phoneNumber;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(max = 11)
    private String PESEL;

    @NotBlank
    private String address;

    @NotBlank
    private String password;

    @NotNull
    @Size(max = 100)
    private String username;

    @NotNull
    private UserGroup userGroup;

    @OneToMany(mappedBy = "user")
    private List<Rental> rentals;

}
