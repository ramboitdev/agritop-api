package com.agrisens.application.port.out;

import com.agrisens.domain.model.ClimateObservation;
import java.util.List;

public interface ClimateObservationRepository {
    ClimateObservation save(ClimateObservation co);
    List<ClimateObservation> findByParcelId(Long parcelId);
}
