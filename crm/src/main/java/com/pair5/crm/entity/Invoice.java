package com.pair5.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "status")
    private String status;

    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "payment_type_id", referencedColumnName = "id")
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "invoice_type_id", referencedColumnName = "id")
    private InvoiceType invoiceType;

    @OneToMany(mappedBy = "invoice")
    private List<OrderInvoice> orderInvoices;

    @ManyToMany(mappedBy = "invoices")
    private List<Subscription> subscriptions;
}
