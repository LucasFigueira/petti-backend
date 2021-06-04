package br.com.petti.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PettiController {

	@GetMapping("/healthcheck")
    public ResponseEntity<String> getHealthApplication() {

        return ResponseEntity.ok("Petti Backend - Ok");
    }
}
