package ru.jvst.automation.protector.leakagecurrent;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.automation.characteristic.*;
import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.Leakage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.LeakageType;

/**
 * Устройство защитного отключения (УЗО)
 */
@Data
@Builder
@EqualsAndHashCode
public class RCD implements LeakageCurrent {
    private Amperage amperage;
    private Leakage leakage;
    private LeakageType leakageType;

}
