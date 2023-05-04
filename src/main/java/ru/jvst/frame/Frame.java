package ru.jvst.frame;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.frame.characteristic.Modules;

@Data
@Builder
@EqualsAndHashCode
public class Frame {
    private Modules modules;
}
