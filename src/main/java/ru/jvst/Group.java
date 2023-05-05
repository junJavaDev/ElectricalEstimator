package ru.jvst;

import lombok.Data;
import ru.jvst.breakers.characteristics.*;

/**
 * Группа, т.е. линия от щита до потребителя, у которой есть свой автоматический выключатель
 **/
@Data
public class Group {
    private String name;                                    // Название группы

    private LeakageCurrent leakageCurrent;                  // Защита от утечки по току
    private OverCurrent overCurrent;                        // Защита от перегрузки по току

    private float cableLength;                              // Длина кабеля
    private CableSection cableSection;                      // Сечение кабеля
    private CableType cableType;                            // Тип кабеля
    private CableFlexibility cableFlexibility;              // Гибкость кабеля
    private CableCores cableCores;                          // Жилы кабеля

    private float corrugatedPipeLength;                     // Длина гофры
    private CorrugatedPipeSection corrugatedPipeSection;    // Сечение гофры
    private CorrugatedPipeType corrugatedPipeType;          // Тип гофры

    private int installationBox;                            // Подрозетник
    private int deepInstallationBox;                        // Глубокий подрозетник



}
