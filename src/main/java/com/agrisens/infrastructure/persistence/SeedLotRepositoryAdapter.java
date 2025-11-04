package com.agrisens.infrastructure.persistence;

import com.agrisens.application.port.out.SeedLotRepository;
import com.agrisens.domain.model.SeedLot;
import com.agrisens.infrastructure.persistence.entity.SeedLotEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SeedLotRepositoryAdapter implements SeedLotRepository {

    private final JpaSeedLotRepository jpaRepo;

    public SeedLotRepositoryAdapter(JpaSeedLotRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public SeedLot save(SeedLot seedLot) {
        SeedLotEntity entity = new SeedLotEntity();
        entity.setVariety(seedLot.getVariety());
        entity.setSupplier(seedLot.getSupplier());
        entity.setYear(seedLot.getYear());
        SeedLotEntity saved = jpaRepo.save(entity);
        return new SeedLot(saved.getId(), saved.getVariety(), saved.getSupplier(), saved.getYear());
    }

    @Override
    public Optional<SeedLot> findById(Long id) {
        return jpaRepo.findById(id).map(e -> new SeedLot(e.getId(), e.getVariety(), e.getSupplier(), e.getYear()));
    }

    @Override
    public List<SeedLot> findByVariety(String variety) {
        return jpaRepo.findByVariety(variety).stream()
            .map(e -> new SeedLot(e.getId(), e.getVariety(), e.getSupplier(), e.getYear()))
            .collect(Collectors.toList());
    }
}
