package com.agrisens.infrastructure.config;

import com.agrisens.application.usecase.RegisterParcelUseCase;
import com.agrisens.application.usecase.RegisterSeedLotUseCase;
import com.agrisens.application.port.out.ParcelRepository;
import com.agrisens.application.port.out.SeedLotRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public RegisterParcelUseCase registerParcelUseCase(ParcelRepository repo) {
        return new RegisterParcelUseCase(repo);
    }

    @Bean
    public RegisterSeedLotUseCase registerSeedLotUseCase(SeedLotRepository repo) {
        return new RegisterSeedLotUseCase(repo);
    }
}
