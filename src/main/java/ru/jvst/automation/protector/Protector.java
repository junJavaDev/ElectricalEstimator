package ru.jvst.automation.protector;

import lombok.Data;
import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.characteristic.Modularity;
import ru.jvst.automation.protector.characteristic.Phase;

@Data
public abstract class Protector {
    private Amperage amperage;
    private Modularity modularity;
    private Phase phase;
}
