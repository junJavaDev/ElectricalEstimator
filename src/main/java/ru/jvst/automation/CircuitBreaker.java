package ru.jvst.automation;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.automation.characteristic.Amperage;
import ru.jvst.automation.characteristic.BreakerType;
import ru.jvst.automation.protection.Overcurrent;

/**
 * Автоматический выключатель
 */
@Data
@Builder
@EqualsAndHashCode
public class CircuitBreaker implements Overcurrent {
    private Amperage amperage;
    private BreakerType breakerType;
}
