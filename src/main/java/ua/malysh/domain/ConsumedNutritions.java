package ua.malysh.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Embeddable
@Data
@Builder
@AllArgsConstructor
public class ConsumedNutritions {

    @Column(name = "consumed_calorie")
    private Double calories;

    @Column(name = "consumed_carbohydrates")
    private Double carbohydrates;

    @Column(name = "consumed_water")
    private Double water;

    @Column(name = "consumed_fat")
    private Double fats;

    @Column(name = "consumed_protein")
    private Double proteins;

    public ConsumedNutritions() {
        this.calories = 0D;
        this.carbohydrates = 0D;
        this.water = 0D;
        this.fats = 0D;
        this.proteins = 0D;
    }
}
