package com.agrisens.infrastructure.persistence;

import com.agrisens.application.port.out.ParcelRepository;
import com.agrisens.domain.model.Parcel;
import com.agrisens.infrastructure.persistence.entity.ParcelEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ParcelRepositoryAdapter implements ParcelRepository {

    private final JpaParcelRepository jpa;

    public ParcelRepositoryAdapter(JpaParcelRepository jpa) { this.jpa = jpa; }

    @Override
    public Parcel save(Parcel parcel) {
        ParcelEntity e = new ParcelEntity();
        e.setOwner(parcel.getOwner());
        e.setName(parcel.getName());
        e.setSoilType(parcel.getSoilType());
        e.setZone(parcel.getZone());
        ParcelEntity saved = jpa.save(e);
        return new Parcel(saved.getId(), saved.getOwner(), saved.getName(), saved.getSoilType(), saved.getZone());
    }

    @Override
    public Optional<Parcel> findById(Long id) {
        return jpa.findById(id).map(e -> new Parcel(e.getId(), e.getOwner(), e.getName(), e.getSoilType(), e.getZone()));
    }
}
