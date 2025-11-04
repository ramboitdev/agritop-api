package com.agrisens.application.usecase;

import com.agrisens.application.port.out.SeedLotRepository;
import com.agrisens.domain.model.SeedLot;

public class RegisterSeedLotUseCase {

    private final SeedLotRepository repository;

    public RegisterSeedLotUseCase(SeedLotRepository repository) {
        this.repository = repository;
    }

    public Long execute(String variety, String supplier, int year) {
        SeedLot seedLot = new SeedLot(null, variety, supplier, year);
        return repository.save(seedLot).getId();
    }
}
