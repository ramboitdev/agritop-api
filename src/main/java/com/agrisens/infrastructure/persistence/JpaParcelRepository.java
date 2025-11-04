package com.agrisens.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agrisens.infrastructure.persistence.entity.ParcelEntity;

public interface JpaParcelRepository extends JpaRepository<ParcelEntity, Long> {
}
