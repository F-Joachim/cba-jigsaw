package org.example.service.api;

import org.example.service.internal.ServiceImpl;

public class ServiceFactory {
    public Service createService() {
        return new ServiceImpl();
    }
}
