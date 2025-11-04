package com.agrisens.domain.model;

public class Parcel {
    private Long id;
    private String owner;
    private String name;
    private String soilType;
    private String zone;

    public Parcel(Long id, String owner, String name, String soilType, String zone) {
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.soilType = soilType;
        this.zone = zone;
    }

    public Long getId() { return id; }
    public String getOwner() { return owner; }
    public String getName() { return name; }
    public String getSoilType() { return soilType; }
    public String getZone() { return zone; }
}
