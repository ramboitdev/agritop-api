package com.agrisens.domain.model;

import java.time.OffsetDateTime;

public class ClimateObservation {
    private Long id;
    private Long parcelId;
    private OffsetDateTime observedAt;
    private Double temperature;
    private Double precipitation;
    private Double humidity;

    public ClimateObservation(Long id, Long parcelId, OffsetDateTime observedAt, Double temperature, Double precipitation, Double humidity) {
        this.id = id;
        this.parcelId = parcelId;
        this.observedAt = observedAt;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public Long getId() { return id; }
    public Long getParcelId() { return parcelId; }
    public OffsetDateTime getObservedAt() { return observedAt; }
    public Double getTemperature() { return temperature; }
    public Double getPrecipitation() { return precipitation; }
    public Double getHumidity() { return humidity; }
}
