package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "plan_types")
public class PlanType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "planType")
    private List<SubscriptionPackage> subscriptionPackages;  // Bu plan türündeki abonelik paketleri
}
