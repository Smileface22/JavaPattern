package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("voldemort")
    public Magican voldemort(){
        return new Voldemort();
    }
    @Bean("harrypotter")
    public Magican harryPotter(){
        return new HarryPotter();
    }
    @Bean("ronweasley")
    public Magican ronWeasley(){
        return new RonWeasley();
    }
}
