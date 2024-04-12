package br.com.compassuol.sp.challenge.msproducts.model.entities;

import br.com.compassuol.sp.challenge.msproducts.presentation.DTO.request.ProductRequestDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_product")
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private LocalDate date;
    private String description;
    private String name;
    private String imgUrl;
    private BigDecimal price;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(
            name = "tb_product_category",
            joinColumns = @JoinColumn(name = "productId"),
            inverseJoinColumns = @JoinColumn(name = "categoryId"))
    private List<Category> categoriesList;

    public Product(ProductRequestDTO productRequestDTO) {
        setDescription(productRequestDTO.description());
        setName(productRequestDTO.name());
        setImgUrl(productRequestDTO.imgUrl());
        setPrice(productRequestDTO.price());
    }
}
