/**
 * The Patient class represents a patient.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Patient {

    /** Medicines for this patient. */
    private Collection<Medicine> medicines = new ArrayList<>();

    /** Default days back. */
    private static final int DAYS_BACK = 90;

    /**
     * Add medicine to the patient.
     * @param medicine to add.
     */
    public void addMedicine(final Medicine medicine) {
        this.medicines.add(medicine);
    }

    /**
     * Determines if the patient has any medicine clashes, default period.
     * @param medicineNames to be checked for a clash.
     * @return Collection of days on which all the medicines were being taken.
     */
    public Collection<LocalDate> clash(final Collection<String> medicineNames) {
        return clash(medicineNames, DAYS_BACK);
    }

    /**
     * This method determines if the patient has any medicine clashes.
     * @param medicineNames to be checked for a clash.
     * @param daysBack      period of time.
     * @return Collection of days on which all the medicines were being taken.
     */
    public Collection<LocalDate> clash(
        final Collection<String> medicineNames,
        final int daysBack) {
        boolean isMedicineNamePassed =
            (medicineNames == null || medicineNames.isEmpty());
        Collection<LocalDate> result = new ArrayList<>();

        if (isMedicineNamePassed) {
            return result;
        }
        for (String name : medicineNames) {
            for (Medicine medicine : medicines) {
                if (medicine.getName().equals(name)) {
                    Collection<Prescription> pre = medicine.getPrescription();
                    if (pre.iterator().hasNext()) {
                        result.add(pre.iterator().next().getDispenseDate());
                    }
                }
            }
        }
        return result;
    }
}
