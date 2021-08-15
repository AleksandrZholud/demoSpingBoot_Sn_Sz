package com.example.demospingboot_snsz.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    
    private String name;
    
    private String lastName;
    
    private String phoneNumber;
    
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "contactperson_fk")
    private Supplier supplier;
    
    public Supplier getSupplier() {
        return supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName( String name ) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }
}