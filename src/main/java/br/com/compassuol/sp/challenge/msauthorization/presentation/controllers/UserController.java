package br.com.compassuol.sp.challenge.msauthorization.presentation.controllers;

import br.com.compassuol.sp.challenge.msauthorization.business.services.ConverterService;
import br.com.compassuol.sp.challenge.msauthorization.business.services.UserService;
import br.com.compassuol.sp.challenge.msauthorization.model.entities.User;
import br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.request.UserRequestDTO;
import br.com.compassuol.sp.challenge.msauthorization.presentation.DTO.response.UserResponseDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
//@SessionScope
public class UserController {
    private UserService userService;
    private ConverterService converterService;

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable Integer id) {
        try {
            User user = userService.findById(id);
            return ResponseEntity.ok(new UserResponseDTO(user));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity save(@Valid @RequestBody UserRequestDTO userRequestDTO) {
        try {

            User user = converterService.DTOToUser(userRequestDTO);
            UserResponseDTO userResponseDTO = new UserResponseDTO(userService.save(user));
            return new ResponseEntity(userResponseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable Integer id, @Valid @RequestBody UserRequestDTO userRequestDTO) {
        try {
            User user = converterService.DTOToUser(userRequestDTO);
            user.setUserId(id);
            UserResponseDTO userResponseDTO = new UserResponseDTO(userService.save(user));
            return new ResponseEntity(userResponseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
