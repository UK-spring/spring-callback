package com.example.springcallback.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements InitializingBean, DisposableBean {

    // InitializingBean 인터페이스의 초기화 메서드
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBean 초기화 - afterPropertiesSet() 호출됨");
    }

    // DisposableBean 인터페이스의 종료 메서드
    @Override
    public void destroy() throws Exception {
        System.out.println("MyBean 종료 - destroy() 호출됨");
    }

    public void doSomething() {
        System.out.println("MyBean 작업 중...");
    }

}
