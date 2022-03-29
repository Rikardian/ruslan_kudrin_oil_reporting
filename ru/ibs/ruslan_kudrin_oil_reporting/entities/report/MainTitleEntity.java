package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/*
Титульный лист
 */
@Entity
@NoArgsConstructor
@Data
public class MainTitleEntity {

    /*
    Id листа
     */
    @Id
    @Column(name = "main_title_id")
    private long mainTitleId;

    /*
    Дата "О внесении изменений"
     */
    @Column(name = "form_date")
    private Date formDate;

    /*
    Номер формы
     */
    @Column(name = "form_number")
    private long formNumber;

    /*
    Наименования отчитывающейся организации
     */
    @Column(name = "org_name")
    private String orgName;

    /*
    Почтовый адрес
     */
    @Column(name = "mailing_address")
    private String mailingAddress;

    /*
    Код формы по ОКУД
     */
    @Column(name = "ocud_code")
    private String ocudCode;

    /*
    Код ОКПО
     */
    @Column(name = "okpo_num")
    private String okpoNum;

    /*
    Раздел 1.
    Добыча нефти, тонн
     */
    @OneToMany
    @JoinColumn(name = "oil_productions")
    private List<OilProductionEntity> oilProductions;

    /*
    Раздел 2.
    Баланс календарного времени фонда нефтяных скважин, часов
     */
    @OneToMany
    @JoinColumn(name = "calendar_balances")
    private List<CalendarBalanceEntity> calendarBalances;

    /*
    Раздел 3.
    Ввод в действие скважин, единиц
     */
    @OneToMany
    @JoinColumn(name = "commissioning_of_wells")
    private List<CommissioningOfWellsEntity> commissioningOfWells;

    /*
    Раздел 4.
    Добыча нефти из пластов, разрабатываемых с применением методов
    искусственного воздействия на пласт, тонн
     */
    @OneToMany
    @JoinColumn(name = "reservoir_oil_productions")
    private List<ReservoirOilProductionEntity> reservoirOilProductions;

    /*
    Раздел 5.
    Фонд скважин на конец отчетного периода, единиц
     */
    @OneToOne
    @JoinColumn(name = "well_fund")
    private WellFundEntity wellFund;

    /*
    Раздел 6. Добыча нефтяного (попутного) газа, тысяч кубических метров
     */
    @OneToOne
    @JoinColumn(name = "oil_gas_production")
    private OilGasProductionEntity oilGasProduction;

    /*
    Раздел 7.
    Движение нфти (включая газовый конденсат) с начала года, тонн
     */
    @OneToOne
    @JoinColumn(name = "oil_movement")
    private OilMovementEntity oilMovement;

    /*
    Раздел 8.
    Подготовка нефти (включая газовый конденсат), тонн
     */
    @OneToOne
    @JoinColumn(name = "oil_treatment")
    private OilTreatmentEntity oilTreatment;

    /*
    Должностное лицо, ответственное за предоставление данных
     */
    @OneToOne
    @JoinColumn(name = "executive")
    private ExecutiveEntity executive;

}
