package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Data
public class WellFundEntity {

    @Id
    private long wellFundId;

    private int oilGasProduct;

    private int stoppedLastMonth;

    private int totalActive;

    private int dormantFund;

    private int waitingAfterWork;

    private int developmentWork;

    private int totalFund;

    private int telemechanized;

    private int waterIntake;

    private int injection;

    private int inActive;

    private int control;

    private int wasteWaterDischarge;

    private int inConservation;

    private int pendingLiquidation;

    private int liquidationExpl;

    private int liquidationDrilling;

    private int totalWellsFund;

    private int onStartYear;

    private int fromGasFund;

    private long referenceToTheSection;

    @OneToOne
    @JoinColumn
    private ReferenceToTheSectionEntity referenceToTheSectionEntity;
}
