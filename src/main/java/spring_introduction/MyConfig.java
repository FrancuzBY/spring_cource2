package spring_introduction;

import org.springframework.context.annotation.*;

import java.time.Period;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
