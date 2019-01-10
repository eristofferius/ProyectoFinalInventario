package cl.accenture.programatufuturo.proyectofinal.inventario;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Programa{
    public static void main(String[] args) {
        SpringApplication.run(Programa.class, args);
    }
}

