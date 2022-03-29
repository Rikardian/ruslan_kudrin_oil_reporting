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
public class MainTitleEntity {

    @Id
    private long mainTitleId;

    private long formNumber;

    private String orgName;

    private String mailingAddress;

    private String ocudCode;

    private String okpoNum;

    @OneToOne
    @JoinColumn
    private OilProductionEntity oilProductionEntity;

    @OneToOne
    @JoinColumn
    private CalendarBalanceEntity calendarBalanceEntity;

    @OneToOne
    @JoinColumn
    private CommissioningOfWells commissioningOfWells;

    @OneToOne
    @JoinColumn
    private ReservoirOilProductionEntity reservoirOilProductionEntity;



}
