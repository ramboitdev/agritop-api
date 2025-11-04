package com.agrisens.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agrisens.infrastructure.persistence.entity.SeedLotEntity;
import java.util.List;

public interface JpaSeedLotRepository extends JpaRepository<SeedLotEntity, Long> {
    List<SeedLotEntity> findByVariety(String variety);
}
