package ru.jvst.wall;

import lombok.Builder;
import lombok.Data;
import ru.jvst.frame.Frame;
import ru.jvst.installationbox.InstallationBox;
import ru.jvst.wall.characteristics.WallMaterial;

import java.util.Map;

@Data
@Builder
public class Wall {
    private WallMaterial material;                          // Материал стены
    Map<Frame, Integer> frames;                             // Рамки
    Map<InstallationBox, Integer> installationBoxes;        // Установочные коробки
}
