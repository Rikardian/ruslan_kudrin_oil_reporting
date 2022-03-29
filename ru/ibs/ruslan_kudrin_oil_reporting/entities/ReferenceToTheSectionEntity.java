package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class ReferenceToTheSectionEntity {

    @Id
    private long referenceToTheSectionId;

    private int arrivedInFund;

    private int droppedOutFund;
}
