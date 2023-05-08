package ru.jvst.automation.protector.overcurrent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import ru.jvst.automation.protector.Protector;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

/**
 * Автоматический выключатель
 */
@Data
@SuperBuilder
@EqualsAndHashCode
public class CircuitBreaker extends Protector implements Overcurrent {
    private BreakerType breakerType;
}
