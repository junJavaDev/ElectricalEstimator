package ru.jvst.breakers.characteristics;

/**
 * Защита от перегрузки по току
 */
public interface OverCurrent {
    Amperage getAmperage();
    void setAmperage(Amperage amperage);

    BreakerType getBreakerType();
    void setBreakerType(BreakerType breakerType);
}
