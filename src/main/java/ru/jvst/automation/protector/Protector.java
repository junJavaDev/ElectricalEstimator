package ru.jvst.automation.protector;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.characteristic.Modularity;
import ru.jvst.automation.protector.characteristic.Phase;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class Protector implements Protect{
    private Amperage amperage;
    private Modularity modularity;
    private Phase phase;
}
