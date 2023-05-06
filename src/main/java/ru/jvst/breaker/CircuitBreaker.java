package ru.jvst.breaker;

import lombok.Builder;
import lombok.Data;
import ru.jvst.breaker.characteristic.Amperage;
import ru.jvst.breaker.characteristic.BreakerType;
import ru.jvst.breaker.characteristic.OverCurrent;

/**
 * Автоматический выключатель
 */
@Data
@Builder
public class CircuitBreaker implements OverCurrent {
    private Amperage amperage;
    private BreakerType breakerType;
}
