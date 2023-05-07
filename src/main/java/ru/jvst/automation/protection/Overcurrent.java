package ru.jvst.automation.protection;

import ru.jvst.automation.characteristic.Amperage;
import ru.jvst.automation.characteristic.BreakerType;

/**
 * Защита от перегрузки по току
 */
public interface Overcurrent {
    Amperage getAmperage();
    void setAmperage(Amperage amperage);

    BreakerType getBreakerType();
    void setBreakerType(BreakerType breakerType);
}
