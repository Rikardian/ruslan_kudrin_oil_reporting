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

    private String wayName;

    private int standardPumpsCount;

    private int electricPumpsCount;

    private int compressorCount;

    private int otherMethodsCount;

    private int totalCount;

    private int oldWellsCount;

    private int lastYearsWellsCount;

    private int newWellsCount;

    private int randomOilProduction;

    private int explorationWellCount;
}
