package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

// Part 2: Implement PrototypeRegistry interface
public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {
    private Map<UserType, User> prototypeRegistry;

    public UserPrototypeRegistryImpl() {
        this.prototypeRegistry = new HashMap<>();
    }

    @Override
    public void addPrototype(User user) {
        this.prototypeRegistry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return this.prototypeRegistry.get(type);
    }

    @Override
    public User clone(UserType type) {
        User prototype = this.prototypeRegistry.get(type);
        if (prototype == null)
            throw new IllegalArgumentException("No prototype registered for type: " + type);
        return prototype.cloneObject();
    }
    
}
