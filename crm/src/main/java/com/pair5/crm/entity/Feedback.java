package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="explanation")
    private String explanation;

    @Column(name="action")
    private String action;

    @Column(name="opening_date")
    private Date openingDate;

    @Column(name="closing_date")
    private Date closingDate;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="feedback_type_id", referencedColumnName = "id")
    private FeedbackType feedbackType;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    private Employee employee;
}
