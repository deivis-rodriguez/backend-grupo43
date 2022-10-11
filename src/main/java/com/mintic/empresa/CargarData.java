package com.mintic.empresa;

//import com.mintic.empresa.entity.Empleado;
import com.mintic.empresa.repository.EmpleadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargarData {

    @Bean
    public CommandLineRunner inicarBaseDatos(EmpleadoRepository repository) {
        return (args) -> {
            /*repository.save(new Empleado("Carlos manuel", "administrador"));
            repository.save(new Empleado("Maria camila", "vendedora"));
            repository.save(new Empleado("arnulfo de jesus", "vigilante"));*/
        };
    }
}
