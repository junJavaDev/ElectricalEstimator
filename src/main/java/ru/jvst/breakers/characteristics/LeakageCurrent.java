package ru.jvst.breakers.characteristics;

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
