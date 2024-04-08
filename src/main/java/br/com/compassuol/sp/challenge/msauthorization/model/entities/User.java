package br.com.compassuol.sp.challenge.msauthorization.model.entities;

import br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.request.UserRequestDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "tb_user_role",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId")
    )
    private List<Role> roles;

    public User(UserRequestDTO userRequestDTO) {
        this.firstName = userRequestDTO.firstName();
        this.lastName = userRequestDTO.lastName();
        this.email = userRequestDTO.email();
        this.password = userRequestDTO.password();
    }
}
