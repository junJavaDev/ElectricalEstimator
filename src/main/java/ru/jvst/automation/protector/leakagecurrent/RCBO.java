package ru.jvst.automation.protector.leakagecurrent;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ru.jvst.automation.protector.Protector;
import ru.jvst.automation.protector.leakagecurrent.characteristic.Leakage;
import ru.jvst.automation.protector.leakagecurrent.characteristic.LeakageType;
import ru.jvst.automation.protector.overcurrent.Overcurrent;
import ru.jvst.automation.protector.overcurrent.characteristic.BreakerType;

/**
 * Дифференциальный автомат
 */
@Entity
@SuperBuilder
@NoArgsConstructor
public class RCBO extends Protector implements Overcurrent, LeakageCurrent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Leakage leakage;
    private BreakerType breakerType;
    private LeakageType leakageType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Leakage getLeakage() {
        return leakage;
    }

    @Override
    public void setLeakage(Leakage leakage) {
        this.leakage = leakage;
    }

    @Override
    public BreakerType getBreakerType() {
        return breakerType;
    }

    @Override
    public void setBreakerType(BreakerType breakerType) {
        this.breakerType = breakerType;
    }

    @Override
    public LeakageType getLeakageType() {
        return leakageType;
    }

    @Override
    public void setLeakageType(LeakageType leakageType) {
        this.leakageType = leakageType;
    }
}
