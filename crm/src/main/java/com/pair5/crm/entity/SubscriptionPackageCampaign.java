package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "subscription_package_campaigns")
public class SubscriptionPackageCampaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subscription_package_id", referencedColumnName = "id")
    private SubscriptionPackage subscriptionPackage;

    @ManyToOne
    @JoinColumn(name = "campaign_id", referencedColumnName = "id")
    private Campaign campaign;

    @Column(name = "status")
    private String status;
}
