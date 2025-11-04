package com.agrisens.application.port.out;

import com.agrisens.domain.model.Culture;
import java.util.Optional;
import java.util.List;

public interface CultureRepository {
    Culture save(Culture culture);
    Optional<Culture> findById(Long id);
    List<Culture> findByParcelId(Long parcelId);
}
