package com.example.springcallback.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.springcallback.lifecycle")
public class InterfaceCallback {

    public static void main(String[] args) {
        // Spring 컨테이너 생성 및 설정 클래스 등록
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InterfaceCallback.class);

        // Bean 사용
        MyBean myBean = context.getBean(MyBean.class);
        myBean.doSomething();

        // 컨테이너 종료 (DisposableBean 호출됨)
        context.close();
    }

}
