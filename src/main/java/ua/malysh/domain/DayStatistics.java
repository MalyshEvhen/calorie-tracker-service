package ua.malysh.domain;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.time.LocalDateTime;
import java.util.Objects;

import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "day_statistics")
@Getter
@Setter
@NoArgsConstructor
public class DayStatistics {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "day_statistics_id",
            nullable = false,
            unique = true)
    private Long id;

    @Column(name = "profile_id",
            nullable = false,
            unique = true)
    private Long profileId;

    @Embedded
    private Diet diet;

    @Embedded
    private ConsumedNutritions consumed;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DayStatistics statistics = (DayStatistics) o;
        return this.getId() != null && Objects.equals(this.getId(), statistics.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
