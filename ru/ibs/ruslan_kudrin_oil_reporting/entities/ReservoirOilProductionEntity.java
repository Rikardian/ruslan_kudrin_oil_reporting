package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class ReservoirOilProductionEntity {

    @Id
    private long reservoirOilProductionId;

    private String methodsOfInfluence;

    private int extraction;

    private int increase;
}
