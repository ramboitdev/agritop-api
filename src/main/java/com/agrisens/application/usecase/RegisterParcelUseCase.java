package com.agrisens.application.usecase;

import com.agrisens.application.port.out.ParcelRepository;
import com.agrisens.domain.model.Parcel;

public class RegisterParcelUseCase {
    private final ParcelRepository repo;
    public RegisterParcelUseCase(ParcelRepository repo) { this.repo = repo; }
    public Long execute(String owner, String name, String soilType, String zone) {
        Parcel p = new Parcel(null, owner, name, soilType, zone);
        return repo.save(p).getId();
    }
}
