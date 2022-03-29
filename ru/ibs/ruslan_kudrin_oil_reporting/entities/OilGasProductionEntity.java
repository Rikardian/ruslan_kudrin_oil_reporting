package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class OilGasProductionEntity {

    @Id
    private long oilGasProductionId;

    private int gasExtraction;

    private int gasConsumption;

    private int technologicalLoss;

    private int burnedInTorches;
}
