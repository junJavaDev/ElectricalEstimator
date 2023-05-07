package ru.jvst.automation;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.automation.characteristic.*;
import ru.jvst.automation.protection.LeakageCurrent;
import ru.jvst.automation.protection.Overcurrent;

/**
 * Дифференциальный автомат
 */
@Data
@Builder
@EqualsAndHashCode
public class RCBO implements Overcurrent, LeakageCurrent {
    private Amperage amperage;
    private Leakage leakage;
    private BreakerType breakerType;
    private LeakageType leakageType;

}
