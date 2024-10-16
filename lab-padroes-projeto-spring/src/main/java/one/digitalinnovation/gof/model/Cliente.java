package one.digitalinnovation.gof.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
   
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Endereco endereco;
}
