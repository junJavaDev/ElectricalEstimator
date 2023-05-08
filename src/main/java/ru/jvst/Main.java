package ru.jvst;

import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.characteristic.Modularity;
import ru.jvst.automation.protector.characteristic.Phase;
import ru.jvst.automation.protector.overcurrent.CircuitBreaker;
import ru.jvst.automation.protector.overcurrent.Overcurrent;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

public class Main {
    public static void main(String[] args) {
        Overcurrent overcurrent =
                CircuitBreaker.builder()
                    .phase(Phase._1L)
                    .breakerType(BreakerType.C)
                    .modularity(Modularity._1)
                    .amperage(Amperage._16A)
                    .build();
        System.out.println("modularity: " + overcurrent.getModularity());
        System.out.println("amperage: " + overcurrent.getAmperage());
        System.out.println("phase: " + overcurrent.getPhase());
        System.out.println("breaker type: " + overcurrent.getBreakerType());
    }
}