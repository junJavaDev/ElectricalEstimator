package ru.jvst;

import lombok.Builder;
import lombok.Data;
import ru.jvst.automation.protector.leakagecurrent.LeakageCurrent;
import ru.jvst.automation.protector.overcurrent.Overcurrent;
import ru.jvst.cable.Cable;
import ru.jvst.pipe.Pipe;

import java.util.Map;

/**
 * Группа, т.е. линия от щита до потребителя, у которой есть свой автоматический выключатель
 **/
@Data
@Builder
public class Group {
    private String name;                                    // Название группы

    private LeakageCurrent leakageCurrent;                  // Защита от утечки по току
    private Overcurrent overCurrent;                        // Защита от перегрузки по току

    Map<Cable, Float> cables;                               // Отрезки кабелей
    Map<Pipe, Float> pipes;                                 // Отрезки гофр




}
