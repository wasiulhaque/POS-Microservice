package com.example.customerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String email;
    @Field
    private String shippingAddress;
    @Field
    private double previousOrderID[];
}
