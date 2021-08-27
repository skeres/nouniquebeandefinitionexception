package com.sks.nouniquebeandefinitionexception.component;

import com.sks.nouniquebeandefinitionexception.interfaces.IhelloWorldService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImplementation2 implements IhelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("Hello implementation no 2");
    }
}
