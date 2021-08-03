package one.digitalinnovation.citiesapi.city.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

import one.digitalinnovation.citiesapi.city.model.PointType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;


@Entity
@Table(name = "cidade")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@TypeDefs({
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "uf")
    private Integer uf;

    @Column(name = "ibge")
    private Integer ibge;

    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point geolocation;

}
