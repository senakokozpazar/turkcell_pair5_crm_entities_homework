package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "campaigns")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "segmentation_id", referencedColumnName = "id")
    private Segmentation segmentation;

    @OneToMany(mappedBy = "campaign")
    private List<SubscriptionPackageCampaign> subscriptionPackageCampaigns;

    @OneToMany(mappedBy = "campaign")
    private List<ProductCampaign> productCampaigns;
}
