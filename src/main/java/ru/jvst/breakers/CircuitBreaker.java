package ru.jvst.breakers;

import lombok.Builder;
import lombok.Data;
import ru.jvst.breakers.characteristics.Amperage;
import ru.jvst.breakers.characteristics.BreakerType;
import ru.jvst.breakers.characteristics.OverCurrent;

/**
 * Автоматический выключатель
 */
@Data
@Builder
public class CircuitBreaker implements OverCurrent {
    private Amperage amperage;
    private BreakerType breakerType;
}
