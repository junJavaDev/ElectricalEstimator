package ru.jvst.automation.protector.overcurrent;

import ru.jvst.automation.protector.Protect;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

/**
 * Защита от перегрузки по току
 */
public interface Overcurrent extends Protect {
    BreakerType getBreakerType();
    void setBreakerType(BreakerType breakerType);
}
