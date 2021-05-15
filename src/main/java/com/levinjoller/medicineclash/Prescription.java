/**
 * The Prescription class represents a prescription.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import java.time.LocalDate;

public class Prescription {

    /** The day when this prescription was dispensed. */
    private LocalDate dispenseDate;

    /** Amount of days this medicine will be taken since dispense day. */
    private int daysSupply;

    /**
     * Return the day of the dispense of this prescription.
     *
     * @return dispenseDate. 
     */
    public LocalDate getDispenseDate() {
        return dispenseDate;
    }

    /**
     * Constructor.
     *
     * @param dispense of the medicine.
     * @param supply   number of days.
     */
    public Prescription(final LocalDate dispense, final int supply) {
        dispenseDate = dispense;
        daysSupply = supply;
    }
}
