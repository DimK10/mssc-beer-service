package org.springframework.msscbeerservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.msscbeerservice.web.model.CustomerDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getBeerById(@PathVariable("customerId") UUID customerId) {

        // todo impl
        return new ResponseEntity<>(CustomerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody CustomerDto customerDto) {

        // todo impl
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/");

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateBeerById(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {

        // todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    public ResponseEntity deleteBeer(@PathVariable("customerId") UUID customerId){
        
        //todo impl 
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
