package ru.jvst.automation;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.automation.characteristic.Amperage;

/**
 * Рубильник
 */
@Data
@Builder
@EqualsAndHashCode
public class KnifeSwitch {
    private Amperage amperage;
}
