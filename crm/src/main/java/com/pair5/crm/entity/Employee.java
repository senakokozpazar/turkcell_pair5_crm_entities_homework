package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name= "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "employee_operation_claims",
            joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "operation_claim_id", referencedColumnName = "id")
    )
    private List<OperationClaims> operationClaims;

    @OneToMany(mappedBy = "employee")
    private List<Request> requests;

    @OneToMany(mappedBy = "employee")
    private List<ActivityLog> activityLogs;

    @OneToMany(mappedBy = "employee")
    private List<Feedback> feedbacks;
}
