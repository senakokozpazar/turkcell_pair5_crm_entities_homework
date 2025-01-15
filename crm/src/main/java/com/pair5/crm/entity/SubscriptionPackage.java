package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "subscription_packages")
public class SubscriptionPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "plan_id", referencedColumnName = "id")
    private PlanType planType;

    @OneToMany(mappedBy = "subscriptionPackage")
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "subscriptionPackage")
    private List<SubscriptionPackageCampaign> subscriptionPackageCampaigns;
}
