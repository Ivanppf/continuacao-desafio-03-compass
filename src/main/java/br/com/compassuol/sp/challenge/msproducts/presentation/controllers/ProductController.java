package br.com.compassuol.sp.challenge.msproducts.presentation.controllers;

import br.com.compassuol.sp.challenge.msproducts.business.services.ConverterService;
import br.com.compassuol.sp.challenge.msproducts.business.services.ProductService;
import br.com.compassuol.sp.challenge.msproducts.model.entities.Product;
import br.com.compassuol.sp.challenge.msproducts.presentation.DTO.request.ProductRequestDTO;
import br.com.compassuol.sp.challenge.msproducts.presentation.DTO.response.ProductResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    private ConverterService converterService;

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable UUID id) {
        try {
            ProductResponseDTO productResponseDTO = new ProductResponseDTO(productService.findById(id));
            return ResponseEntity.ok(productResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity save(@Valid @RequestBody ProductRequestDTO productRequestDTO) {
        try {
            Product product = converterService.RequestDTOToProduct(productRequestDTO);
            ProductResponseDTO productResponseDTO = new ProductResponseDTO(productService.save(product));
            return new ResponseEntity<>(productResponseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable UUID id, @Valid @RequestBody ProductRequestDTO productRequestDTO) {
        try {
            Product product = converterService.RequestDTOToProduct(productRequestDTO);
            ProductResponseDTO productResponseDTO = new ProductResponseDTO(productService.update(id, product));
            return ResponseEntity.ok(productResponseDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(UUID id) {
        try {
            productService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
