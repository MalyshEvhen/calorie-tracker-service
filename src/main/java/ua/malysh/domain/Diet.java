package ua.malysh.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diet {

    @Column(name = "diet_calories")
    private Double calories;

    @Column(name = "diet_carbohydrates")
    private Double carbohydrates;

    @Column(name = "diet_water")
    private Double water;

    @Column(name = "diet_fat")
    private Double fats;

    @Column(name = "diet_protein")
    private Double proteins;
}
