package spring_annotation_student;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring_annotation_student"})
public class StudentConfig {

}
