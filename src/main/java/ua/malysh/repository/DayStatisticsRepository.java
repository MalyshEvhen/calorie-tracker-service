package ua.malysh.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.malysh.domain.DayStatistics;

@Repository
public interface DayStatisticsRepository extends JpaRepository<DayStatistics, Long> {
    Optional<DayStatistics> findByCreatedAt(LocalDate createdAt);
}
