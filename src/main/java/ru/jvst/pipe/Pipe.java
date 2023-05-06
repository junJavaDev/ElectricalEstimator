package ru.jvst.pipe;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.pipe.characteristics.PipeSection;
import ru.jvst.pipe.characteristics.PipeSmoothness;
import ru.jvst.pipe.characteristics.PipeType;

@Data
@EqualsAndHashCode
public class Pipe {
    private PipeSection section;
    private PipeSmoothness smoothness;
    private PipeType type;
}
