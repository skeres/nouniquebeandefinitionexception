package com.sks.nouniquebeandefinitionexception.component;

import com.sks.nouniquebeandefinitionexception.interfaces.IhelloWorldService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary : if uncomment and no qualifiers are used in InjectionByConstructor and InjectionBySetter,
//           then this bean wil be used by Spring IOC so this implementation will be active
public class HelloWorldImplementation1 implements IhelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("Hello implementation no 1");
    }
}
