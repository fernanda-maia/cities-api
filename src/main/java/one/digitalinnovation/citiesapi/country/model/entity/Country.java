package one.digitalinnovation.citiesapi.country.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Table(name = "pais")
@Getter
@NoArgsConstructor
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String ptName;

    @Column(name = "sigla")
    private String code;

    @Column(name = "bacen")
    private Integer bacen;

}
