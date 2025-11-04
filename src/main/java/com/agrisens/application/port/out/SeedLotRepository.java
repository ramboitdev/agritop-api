package com.agrisens.application.port.out;

import com.agrisens.domain.model.SeedLot;
import java.util.Optional;
import java.util.List;

public interface SeedLotRepository {
    SeedLot save(SeedLot seedLot);
    Optional<SeedLot> findById(Long id);
    List<SeedLot> findByVariety(String variety);
}
