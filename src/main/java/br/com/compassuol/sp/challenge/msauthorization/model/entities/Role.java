package br.com.compassuol.sp.challenge.msauthorization.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tb_role")
@Data
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID roleId;
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
