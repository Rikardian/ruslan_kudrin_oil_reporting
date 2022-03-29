package ru.ibs.ruslan_kudrin_oil_reporting.entities;

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
    private Date formDate;

    /*
    Номер формы
     */
    private long formNumber;

    /*
    Наименования отчитывающейся организации
     */
    private String orgName;

    /*
    Почтовый адрес
     */
    private String mailingAddress;

    /*
    Код формы по ОКУД
     */
    private String ocudCode;

    /*
    Код ОКПО
     */
    private String okpoNum;

    /*
    Раздел 1.
    Добыча нефти, тонн
     */
    @OneToMany
    @JoinColumn
    private List<OilProductionEntity> oilProductionEntities;

    /*
    Раздел 2.
    Баланс календарного времени фонда нефтяных скважин, часов
     */
    @OneToMany
    @JoinColumn
    private List<CalendarBalanceEntity> calendarBalanceEntities;

    /*
    Раздел 3.
    Ввод в действие скважин, единиц
     */
    @OneToMany
    @JoinColumn
    private List<CommissioningOfWellsEntity> commissioningOfWellEntities;

    /*
    Раздел 4.
    Добыча нефти из пластов, разрабатываемых с применением методов
    искусственного воздействия на пласт, тонн
     */
    @OneToMany
    @JoinColumn
    private List<ReservoirOilProductionEntity> reservoirOilProductionEntities;

    /*
    Раздел 5.
    Фонд скважин на конец отчетного периода, единиц
     */
    @OneToOne
    @JoinColumn
    private WellFundEntity wellFund;

    /*
    Раздел 6. Добыча нефтяного (попутного) газа, тысяч кубических метров
     */
    @OneToOne
    @JoinColumn
    private OilGasProductionEntity oilGasProduction;

    /*
    Раздел 7.
    Движение нфти (включая газовый конденсат) с начала года, тонн
     */
    @OneToOne
    @JoinColumn
    private OilMovementEntity oilMovement;

    /*
    Раздел 8.
    Подготовка нефти (включая газовый конденсат), тонн
     */
    @OneToOne
    @JoinColumn
    private OilTreatmentEntity oilTreatment;

    /*
    Должностное лицо, ответственное за предоставление данных
     */
    @OneToOne
    @JoinColumn
    private ExecutiveEntity executive;

}
