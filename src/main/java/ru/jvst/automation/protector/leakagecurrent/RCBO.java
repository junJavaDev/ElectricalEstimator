package ru.jvst.automation.protector.leakagecurrent;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import ru.jvst.automation.protector.Protector;
import ru.jvst.automation.protector.leakagecurrent.characteristic.Leakage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.LeakageType;
import ru.jvst.automation.protector.overcurrent.Overcurrent;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

/**
 * Дифференциальный автомат
 */
@Data
@SuperBuilder
@EqualsAndHashCode
public class RCBO extends Protector implements Overcurrent, LeakageCurrent {
    private Leakage leakage;
    private BreakerType breakerType;
    private LeakageType leakageType;

}
