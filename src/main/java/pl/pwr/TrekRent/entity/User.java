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

    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(max = 11)
    private String PESEL;

    @NotBlank
    private String address;

    @NotBlank
    private String password;

    @NotBlank
    @Size(max = 100)
    private String username;

    @NotBlank
    private UserGroup userGroup;

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Rental> rentals;

}
