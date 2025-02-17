package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

// Part 2: Implement PrototypeRegistry interface
public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {
    private Map<ConfigurationType, Configuration> prototypeRegistry;

    public ConfigurationPrototypeRegistryImpl() {
        this.prototypeRegistry = new HashMap<>();
    }

    @Override
    public void addPrototype(Configuration user) {
        this.prototypeRegistry.put(user.getType(), user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return this.clone(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration prototype = this.prototypeRegistry.get(type);
        if (prototype == null)
            throw new IllegalArgumentException("No prototype registered for the configuration type: " + type);
        return prototype.cloneObject();
    }
    
}
