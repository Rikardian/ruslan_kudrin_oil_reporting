package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class OilMovementEntity {

    @Id
    private long oilMovementId;

    private int balanceAtTheBeginning;

    private int extracted;

    private int succumbed;

    private int total;

    private int totalLoss;

    private int totalHandedOver;

    private int oilAndGasProcessing;

    private int gasProcessing;

    private int oilStabilized;

    private int export;

    private int drilling;

    private int otherOrganizations;

    private int releasedToEnterprises;

    private int totalConsumption;

    private int balanceAtTheEnd;

    private int inOilPipelines;
}
