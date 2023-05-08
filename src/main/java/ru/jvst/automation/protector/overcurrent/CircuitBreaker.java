package ru.jvst.automation.protector.overcurrent;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.automation.protector.Protector;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

/**
 * Автоматический выключатель
 */
@Data
@Builder
@EqualsAndHashCode
public class CircuitBreaker extends Protector implements Overcurrent {
    private BreakerType breakerType;
}
