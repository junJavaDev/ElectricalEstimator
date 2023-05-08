package ru.jvst.automation.protector.leakagecurrent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import ru.jvst.automation.protector.Protector;
import ru.jvst.automation.protector.leakagecurrent.characteristic.Leakage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.LeakageType;

/**
 * Устройство защитного отключения (УЗО)
 */
@Data
@SuperBuilder
@EqualsAndHashCode
public class RCD extends Protector implements LeakageCurrent {
    private Leakage leakage;
    private LeakageType leakageType;

}
