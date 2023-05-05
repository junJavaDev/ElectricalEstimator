package ru.jvst.breakers;

import lombok.Builder;
import lombok.Data;
import ru.jvst.breakers.characteristics.*;

/**
 * Дифференциальный автомат
 */
@Data
@Builder
public class RCBO implements OverCurrent, LeakageCurrent {
    private Amperage amperage;
    private Leakage leakage;
    private BreakerType breakerType;
    private LeakageType leakageType;

}
