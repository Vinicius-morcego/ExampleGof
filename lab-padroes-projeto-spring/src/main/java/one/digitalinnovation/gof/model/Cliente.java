package one.digitalinnovation.gof.model;


import ch.qos.logback.core.boolex.EvaluationException;
import org.springframework.aot.generate.ValueCodeGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;

import static org.springframework.aot.generate.ValueCodeGenerator.*;

@EntityScan
public class Cliente {
    @Id
    @Generated({"com.acme.generator.CodeGen"})
    private Long id;

    
    private Endereco endereco;
}
