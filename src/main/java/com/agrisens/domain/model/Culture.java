package com.agrisens.domain.model;

import java.time.LocalDate;

public class Culture {
    private Long id;
    private Long parcelId;
    private Long seedLotId;
    private LocalDate dateSowed;
    private String stage;
    private Double expectedYield;

    public Culture(Long id, Long parcelId, Long seedLotId, LocalDate dateSowed, String stage, Double expectedYield) {
        this.id = id;
        this.parcelId = parcelId;
        this.seedLotId = seedLotId;
        this.dateSowed = dateSowed;
        this.stage = stage;
        this.expectedYield = expectedYield;
    }

    public Long getId() { return id; }
    public Long getParcelId() { return parcelId; }
    public Long getSeedLotId() { return seedLotId; }
    public LocalDate getDateSowed() { return dateSowed; }
    public String getStage() { return stage; }
    public Double getExpectedYield() { return expectedYield; }
}
