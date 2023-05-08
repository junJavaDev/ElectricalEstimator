package ru.jvst.automation.protector.leakagecurrent;

import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.Leakage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.LeakageType;

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
