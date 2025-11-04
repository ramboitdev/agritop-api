package com.agrisens.infrastructure.web;

import com.agrisens.application.usecase.RegisterSeedLotUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/seed-lots")
public class SeedLotController {

    private final RegisterSeedLotUseCase useCase;

    public SeedLotController(RegisterSeedLotUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public Long register(@RequestBody SeedLotRequest request) {
        return useCase.execute(request.variety(), request.supplier(), request.year());
    }

    public static record SeedLotRequest(String variety, String supplier, int year) {}
}
