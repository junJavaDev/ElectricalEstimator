package ru.jvst.automation.protector;

import ru.jvst.automation.protector.characteristic.Amperage;
import ru.jvst.automation.protector.characteristic.Modularity;
import ru.jvst.automation.protector.characteristic.Phase;

public interface Protect {
    Amperage getAmperage();
    void setAmperage(Amperage amperage);

    Modularity getModularity();
    void setModularity(Modularity modularity);

    Phase getPhase();
    void setPhase(Phase phase);
}
