package ru.jvst;

import lombok.Builder;
import lombok.Data;
import ru.jvst.breaker.characteristic.*;
import ru.jvst.cable.Cable;
import ru.jvst.pipe.Pipe;

/**
 * Группа, т.е. линия от щита до потребителя, у которой есть свой автоматический выключатель
 **/
@Data
@Builder
public class Group {
    private String name;                                    // Название группы

    private LeakageCurrent leakageCurrent;                  // Защита от утечки по току
    private OverCurrent overCurrent;                        // Защита от перегрузки по току

    private Cable cable;                                    // Кабель
    private float cableLength;                              // Длина кабеля

    private Pipe pipe;                                      // Гофра
    private float pipeLength;                               // Длина гофры

    private int deepInstallationBox;                        // Глубокий подрозетник
    private int installationBox;                            // Подрозетник



}
