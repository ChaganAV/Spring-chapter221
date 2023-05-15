import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean("Miki")
    @Primary
    Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }
    @Bean("Koko")
    Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }
}
