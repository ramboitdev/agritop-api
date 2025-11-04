package com.agrisens.domain.model;

public class SeedLot {
    private Long id;
    private String variety;
    private String supplier;
    private int year;

    public SeedLot(Long id, String variety, String supplier, int year) {
        if (variety == null || variety.isBlank()) {
            throw new IllegalArgumentException("Variety cannot be empty");
        }
        this.id = id;
        this.variety = variety;
        this.supplier = supplier;
        this.year = year;
    }

    public Long getId() { return id; }
    public String getVariety() { return variety; }
    public String getSupplier() { return supplier; }
    public int getYear() { return year; }
}
