package ru.jvst.installationbox;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.jvst.installationbox.characteristic.InstallationBoxDepth;
import ru.jvst.installationbox.characteristic.InstallationBoxType;

@Data
@Builder
@EqualsAndHashCode
public class InstallationBox {
    private InstallationBoxDepth installationBoxDepth;
    private InstallationBoxType installationBoxType;
}
