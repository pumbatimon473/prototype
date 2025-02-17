package com.assignment.question;

// Part 1: Implement ClonableObject interface
public class Invoice implements ClonableObject<Invoice> {
    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    public Invoice(Long invoiceId, String customerName, Double amount, String paymentMethod, InvoiceType type) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.type = type;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }

    @Override
    public Invoice cloneObject() {
        // Shallow Copy - Just copying the references of the attrs of the current object
        // Works: Primitive Wrapper Classes are immutable in Java
        return new Invoice(
            this.invoiceId,
            this.customerName,
            this.amount,
            this.paymentMethod,
            this.type);
    }
}