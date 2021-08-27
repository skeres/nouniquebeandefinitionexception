package com.sks.nouniquebeandefinitionexception.component;

import com.sks.nouniquebeandefinitionexception.interfaces.IhelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectionByConstructor {

    private IhelloWorldService helloWorldService;

    //contructor class
    @Autowired
    //@Qualifier' not applicable to constructor, so let's write it in parameters
    public InjectionByConstructor(@Qualifier("helloWorldImplementation1") IhelloWorldService helloWorldService) {
        this.helloWorldService=helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    };

}
