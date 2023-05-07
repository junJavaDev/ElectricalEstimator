package ru.jvst.automation.protection;

import ru.jvst.automation.characteristic.Amperage;
import ru.jvst.automation.characteristic.Leakage;
import ru.jvst.automation.characteristic.LeakageType;

/**
 * Защита от утечки тока
 */

public interface LeakageCurrent {
    Amperage getAmperage();
    void setAmperage(Amperage amperage);

    Leakage getLeakage();
    void setLeakage(Leakage leakage);

    LeakageType getLeakageType();
    void setLeakageType(LeakageType leakageType);
}
