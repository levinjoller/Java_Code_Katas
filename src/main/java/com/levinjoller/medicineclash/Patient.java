/**
 * The Patient class represents a patient.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import java.util.ArrayList;
import java.util.Collection;

public class Patient {

    /**
     * This method determines if the patient has any medicine clashes.
     *
     * @param medicines which are taken.
     * @param days
     * @return Collection of days on which all the medication were being taken
     * during this period.
     */
    public Collection<Medicine> clash(Collection<Medicine> medicines, int days) {
        return new ArrayList<>();
    }
}
