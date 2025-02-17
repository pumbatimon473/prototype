package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

// Part 2: Implement PrototypeRegistry interface
public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {
    private Map<ConfigurationType, Configuration> prototypeRegistry;

    // CTOR
    public ConfigurationPrototypeRegistryImpl() {
        this.prototypeRegistry = new HashMap<>();
    }

    @Override
    public void addPrototype(Configuration user) {
        this.prototypeRegistry.put(user.getType(), user);
    }

    /*
     * org.opentest4j.AssertionFailedError: If the registry pattern is implemented correctly,
     * the registry should return the same object that was added
     * ==> expected: <com.assignment.question.Configuration@5542c4ed>
     * but was: <com.assignment.question.Configuration@1573f9fc>
     */
    @Override
    public Configuration getPrototype(ConfigurationType type) {
        // return this.clone(type);
        return this.prototypeRegistry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration prototype = this.prototypeRegistry.get(type);
        if (prototype == null)
            throw new IllegalArgumentException("No prototype registered for configuration type: " + type);
        return prototype.cloneObject();
    }
    
}
