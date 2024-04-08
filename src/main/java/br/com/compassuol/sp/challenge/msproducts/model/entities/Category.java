package br.com.compassuol.sp.challenge.msproducts.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tb_category")
@Data
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID categoryId;
    private String name;
//    @ManyToMany(mappedBy = "categoriesList")
//    private List<Product> productList;

    public Category(String name) {
        this.name = name;
    }
}
