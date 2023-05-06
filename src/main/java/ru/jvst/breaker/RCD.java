package ru.jvst.breaker;

import lombok.Builder;
import lombok.Data;
import ru.jvst.breaker.characteristic.*;

/**
 * Устройство защитного отключения (УЗО)
 */
@Data
@Builder
public class RCD implements LeakageCurrent {
    private Amperage amperage;
    private Leakage leakage;
    private LeakageType leakageType;

}
