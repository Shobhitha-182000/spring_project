package spring_annotation_Animal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring_annotation_Animal"})
public class AnimalConfig {

}
