package pl.szymlowski.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Calculator calculator = new Calculator();
        calculator.add(2, 5);
        calculator.subtract(3, 1);
    }

}
