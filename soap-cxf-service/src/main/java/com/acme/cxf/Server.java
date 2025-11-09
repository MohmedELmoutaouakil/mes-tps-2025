package com.acme.cxf;

import com.acme.cxf.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
    public static void main(String[] args) {
        String address = "http://localhost:8080/services/hello";
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceBean(new HelloServiceImpl());
        factory.setAddress(address);
        factory.create();
        System.out.println("WSDL: " + address + "?wsdl");
    }
}
