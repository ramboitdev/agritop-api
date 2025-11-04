package com.agrisens.unit;

import com.agrisens.application.usecase.RegisterParcelUseCase;
import com.agrisens.application.port.out.ParcelRepository;
import com.agrisens.domain.model.Parcel;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class RegisterParcelUseCaseTest {

    @Test
    void should_register_parcel_and_return_id() {
        ParcelRepository repo = mock(ParcelRepository.class);
        when(repo.save(any())).thenReturn(new Parcel(1L, "Owner A", "Parcelle 1", "sandy", "highland"));

        RegisterParcelUseCase useCase = new RegisterParcelUseCase(repo);
        Long id = useCase.execute("Owner A", "Parcelle 1", "sandy", "highland");

        assertThat(id).isEqualTo(1L);
        verify(repo).save(any());
    }
}
