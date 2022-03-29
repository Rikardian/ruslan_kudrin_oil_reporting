package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class OilProductionEntity {

    @Id
    private Long oilProductionId;

    private String operatingMethods;

    private int yearProductionId;

    private int countedMonthId;

    private int uncountedMonthId;

    private int averageFlowRate;

    private int numberOfWells;

    private int extractedFromWells;

}
