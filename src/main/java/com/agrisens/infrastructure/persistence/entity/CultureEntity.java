package com.agrisens.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cultures")
public class CultureEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long parcelId;
    private Long seedLotId;
    private LocalDate dateSowed;
    private String stage;
    private Double expectedYield;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getParcelId() { return parcelId; }
    public void setParcelId(Long parcelId) { this.parcelId = parcelId; }
    public Long getSeedLotId() { return seedLotId; }
    public void setSeedLotId(Long seedLotId) { this.seedLotId = seedLotId; }
    public LocalDate getDateSowed() { return dateSowed; }
    public void setDateSowed(LocalDate dateSowed) { this.dateSowed = dateSowed; }
    public String getStage() { return stage; }
    public void setStage(String stage) { this.stage = stage; }
    public Double getExpectedYield() { return expectedYield; }
    public void setExpectedYield(Double expectedYield) { this.expectedYield = expectedYield; }
}
