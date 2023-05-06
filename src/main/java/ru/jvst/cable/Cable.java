package ru.jvst.cable;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.cable.characteristic.CableCores;
import ru.jvst.cable.characteristic.CableFlexibility;
import ru.jvst.cable.characteristic.CableSection;
import ru.jvst.cable.characteristic.CableType;

@Data
@Builder
@EqualsAndHashCode
public class Cable {
    private CableType type;
    private CableFlexibility flexibility;
    private CableCores cores;
    private CableSection section;
}
