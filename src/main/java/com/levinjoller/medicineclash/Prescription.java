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

    /** The Day when this prescription was dispensed. */
    private LocalDate dispenseDate;

    /** Amount of days this medicine will be taken since dispense day. */
    private int daysSupply;

    public LocalDate getDispenseDate() {
        return dispenseDate;
    }

    public Prescription(LocalDate dispenseDate, int daysSupply) {
        this.dispenseDate = dispenseDate;
        this.daysSupply = daysSupply;
    }
}
