package com.iffat.springboot.reactivemongo.mappers;

import com.iffat.springboot.reactivemongo.domain.Customer;
import com.iffat.springboot.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
