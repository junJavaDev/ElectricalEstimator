package ru.jvst.automation;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.automation.characteristic.*;
import ru.jvst.automation.protection.LeakageCurrent;

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
