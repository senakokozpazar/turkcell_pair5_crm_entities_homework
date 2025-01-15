package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="opening_date")
    private Date openingDate;

    @Column(name="closing_date")
    private Date closingDate;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="request_type_id", referencedColumnName = "id")
    private RequestType requestType;

    @ManyToOne
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private Customer customer;

}
