package ru.jvst.wall;

import lombok.Builder;
import lombok.Data;
import ru.jvst.wall.characteristics.WallMaterial;
@Data
@Builder
public class Wall {
    private WallMaterial material;
}
