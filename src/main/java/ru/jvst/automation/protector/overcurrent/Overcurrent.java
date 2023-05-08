package ru.jvst.automation.protector.overcurrent;

import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

/**
 * Защита от перегрузки по току
 */
public interface Overcurrent {
    Amperage getAmperage();
    void setAmperage(Amperage amperage);

    BreakerType getBreakerType();
    void setBreakerType(BreakerType breakerType);
}
