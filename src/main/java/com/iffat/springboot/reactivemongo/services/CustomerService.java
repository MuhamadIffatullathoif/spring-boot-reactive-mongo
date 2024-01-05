package com.iffat.springboot.reactivemongo.services;

import com.iffat.springboot.reactivemongo.model.BeerDTO;
import com.iffat.springboot.reactivemongo.model.CustomerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Flux<CustomerDTO> listCustomers();
    Mono<CustomerDTO> getCustomerById(String customerId);
    Mono<CustomerDTO> saveNewCustomer(CustomerDTO customerDTO);
    Mono<CustomerDTO> saveNewCustomer(Mono<CustomerDTO> customerDTOMono);
    Mono<CustomerDTO> updateCustomer(String customerId, CustomerDTO customerDTO);
    Mono<CustomerDTO> patchCustomer(String customerId, CustomerDTO customerDTO);
    Mono<Void> deleteCustomerById(String customerId);
}
