package com.agrisens.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agrisens.infrastructure.persistence.entity.CultureEntity;
import java.util.List;

public interface JpaCultureRepository extends JpaRepository<CultureEntity, Long> {
    List<CultureEntity> findByParcelId(Long parcelId);
}
