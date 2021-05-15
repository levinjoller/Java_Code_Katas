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

    /**
     * Add medicine to the patient.
     * 
     * @param medicine to add.
     */
    public void addMedicine(Medicine medicine) {
        this.medicines.add(medicine);
    }

    /**
     * This method determines if the patient has any medicine clashes. Default
     * period is 90 days.
     * 
     * @param medicineNames to be checked for a clash.
     * @return Collection of days on which all the medicines were being taken.
     */
    public Collection<LocalDate> clash(final Collection<String> medicineNames) {
        return clash(medicineNames, 90);
    }

    /**
     * This method determines if the patient has any medicine clashes.
     *
     * @param medicineNames to be checked for a clash.
     * @param daysBack      period of time.
     * @return Collection of days on which all the medicines were being taken.
     */
    public Collection<LocalDate> clash(final Collection<String> medicineNames, final int daysBack) {
        boolean isMedicineNamePassed = (medicineNames == null || medicineNames.isEmpty());
        Collection<LocalDate> result = new ArrayList<>();

        if (isMedicineNamePassed) {
            return result;
        }
        for (String name : medicineNames) {
            for (Medicine medicine : medicines) {
                if (medicine.getName().equals(name)) {
                    for (Prescription prescription : medicine.getPrescription()) {
                        result.add(prescription.getDispenseDate());
                    }
                }
            }
        }
        return result;
    }
}
