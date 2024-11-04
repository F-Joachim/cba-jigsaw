package org.example.application;

import org.example.service.api.Service;
import org.example.service.api.ServiceFactory;

public class Application {
    public static void main(String[] args){
        Service service = new ServiceFactory().createService();
        service.run();
    }
}
