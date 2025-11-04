package com.agrisens.infrastructure.web;

import com.agrisens.application.usecase.RegisterParcelUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/parcels")
public class ParcelController {

    private final RegisterParcelUseCase useCase;

    public ParcelController(RegisterParcelUseCase useCase) { this.useCase = useCase; }

    @PostMapping
    public Long create(@RequestBody ParcelRequest req) {
        return useCase.execute(req.owner(), req.name(), req.soilType(), req.zone());
    }

    public static record ParcelRequest(String owner, String name, String soilType, String zone) {}
}
