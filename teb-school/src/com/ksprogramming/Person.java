package com.ksprogramming;

import java.math.BigDecimal;

public class Person {
    private BigDecimal hour;
    private BigDecimal wages;
    private String kindContract;
    private BigDecimal bonusMoney;
    private int daysInMonth;
    private int takenHolidays;
    private int sickDayDuringJobDay;
    private int sickDayWithoutJobDay;
    BigDecimal sum;

    public Person() {
    }

    public Person(BigDecimal hour, BigDecimal wages, String kindContract, BigDecimal bonusMoney, int daysInMonth, int takenHolidays, int sickDayDuringJobDay, int sickDayWithoutJobDay) {
        this.hour = hour;
        this.wages = wages;
        this.kindContract = kindContract;
        this.bonusMoney = bonusMoney;
        this.daysInMonth = daysInMonth;
        this.takenHolidays = takenHolidays;
        this.sickDayDuringJobDay = sickDayDuringJobDay;
        this.sickDayWithoutJobDay = sickDayWithoutJobDay;
        this.sum = sum = bonusMoney.add(wages.multiply(hour));
    }

    public BigDecimal getHour() {
        return hour;
    }

    public BigDecimal getWages() {
        return wages;
    }

    public String getKindContract() {
        return kindContract;
    }

    public BigDecimal getBonusMoney() {
        return bonusMoney;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public int getTakenHolidays() {
        return takenHolidays;
    }

    public int getSickDayDuringJobDay() {
        return sickDayDuringJobDay;
    }

    public int getSickDayWithoutJobDay() {
        return sickDayWithoutJobDay;
    }

    @Override
    public String toString() {
        return  "Godziny: " + hour +
                "\nStawka godzinowa: " + wages +
                "\nRodzaj umowy" + kindContract +
                "\nDodatkowe bonusy: " + bonusMoney +
                "\nIlosc dni miesiaca: " + daysInMonth +
                "\nWzietych wolnych dni: " + takenHolidays +
                "\nDni na chorobowym w trakcie pracy: " + sickDayDuringJobDay +
                "\nDni na chorobowym w dniach wolnych od pracy: " + sickDayWithoutJobDay +
                "\n--------------------------------------------------------------------------------------" +
                "\nTwoja wypłata to: " + sum;
    }
}
