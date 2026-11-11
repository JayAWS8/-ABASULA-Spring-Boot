package com.spring.spring_demo;

import org.springframework.stereotype.Component;

@Component 
public class SeniorHighStudent implements Student {

  public SeniorHighStudent(){
    System.out.println("In constructor:" +getClass().getSimpleName());
  }
  
  @Override
  public String getDailyAssignment() {
    return "Senior High Student: Study Advanced Spring Boot";
  }

}
