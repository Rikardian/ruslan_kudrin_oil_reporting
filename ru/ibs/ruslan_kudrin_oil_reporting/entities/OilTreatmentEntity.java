package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@NoArgsConstructor
@Data
public class OilTreatmentEntity {

    @Id
    private long oilTreatmentId;

    private int receivedLiquid;

    private int receivedOil;

    private int preparedOil;

    private int oilLosses;

}
