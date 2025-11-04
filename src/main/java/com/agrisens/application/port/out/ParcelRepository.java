package com.agrisens.application.port.out;

import com.agrisens.domain.model.Parcel;
import java.util.Optional;

public interface ParcelRepository {
    Parcel save(Parcel parcel);
    Optional<Parcel> findById(Long id);
}
