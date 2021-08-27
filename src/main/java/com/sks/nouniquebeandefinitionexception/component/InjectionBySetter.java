package com.sks.nouniquebeandefinitionexception.component;

import com.sks.nouniquebeandefinitionexception.interfaces.IhelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectionBySetter {

        private IhelloWorldService helloWorldService;

        //no specific constructor initalizing helloWorldService

        //setter for attribute helloWorldService
        @Autowired
        @Qualifier("helloWorldImplementation2")
        public void setHelloWorldService(IhelloWorldService helloWorldService) {
            this.helloWorldService=helloWorldService;
        }

        public void getMessage(){
            helloWorldService.sayHello();
        };
}
