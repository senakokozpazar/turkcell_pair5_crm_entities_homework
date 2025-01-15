package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name="customer_notification")
public class CustomerNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="notification_id", referencedColumnName = "id")
    private NotificationType notificationType;
}
