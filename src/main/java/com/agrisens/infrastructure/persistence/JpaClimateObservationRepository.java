package com.agrisens.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agrisens.infrastructure.persistence.entity.ClimateObservationEntity;
import java.util.List;

public interface JpaClimateObservationRepository extends JpaRepository<ClimateObservationEntity, Long> {
    List<ClimateObservationEntity> findByParcelId(Long parcelId);
}
