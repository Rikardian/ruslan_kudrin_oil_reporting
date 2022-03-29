package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class CommissioningOfWells {

    @Id
    private long commissioningOfWellsId;

    private String name;

    private int oilWells;

    private int explorationWells;

    private int pumpingWells;

    private int electricPumpingWells;

    private int compressorWells;

    private int fountainWells;

    private int injectionWells;

    private int afterOilRecovery;
}
