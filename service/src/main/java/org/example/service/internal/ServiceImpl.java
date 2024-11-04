package org.example.service.internal;

import org.example.service.api.Service;

public class ServiceImpl implements Service {
    @Override
    public void run() {
        System.out.println("ServiceImpl is running");
    }
}
