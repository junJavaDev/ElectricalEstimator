package ru.jvst.breakers;

import lombok.Builder;
import lombok.Data;
import ru.jvst.breakers.characteristics.*;

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
