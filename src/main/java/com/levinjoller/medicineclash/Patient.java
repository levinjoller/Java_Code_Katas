/**
 * The Patient class represents a patient.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

public class Patient {

    /**
     * This method determines if the patient has any medicine clashes.
     *
     * @param medicineNames to be checked for a clash.
     * @param daysBack      period of time.
     * @return Collection of days on which all the medicines were being taken.
     */
    public Collection<Date> clash(
        final Collection<String> medicineNames, final int daysBack) {
        return new ArrayList<>();
    }
}
