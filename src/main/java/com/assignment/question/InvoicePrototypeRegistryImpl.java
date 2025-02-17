package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

// Part 2: Implementing PrototypeRegistry interface
public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {
    private Map<InvoiceType, Invoice> prototypeRegistry;

    public InvoicePrototypeRegistryImpl() {
        this.prototypeRegistry = new HashMap<>();
    }

    @Override
    public void addPrototype(Invoice user) {
        this.prototypeRegistry.put(user.getType(), user);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        Invoice prototype = this.prototypeRegistry.get(type);
        if (prototype == null)
            throw new IllegalArgumentException("No prototype registered for type: " + type);
        return prototype.cloneObject();
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return this.prototypeRegistry.get(type);
    }
    
}
