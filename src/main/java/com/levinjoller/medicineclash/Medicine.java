/**
 * The Medicine class represents a medicine.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import java.util.ArrayList;
import java.util.Collection;

public class Medicine {

    /** Prescriptions for this medicine. */
    private Collection<Prescription> prescriptions = new ArrayList<>();

    /** Unique name of this medicine. */
    private final String name;

    /**
     * Constructor.
     *
     * @param name of medicine.
     */
    public Medicine(final String medicineName) {
        name = medicineName;
    }

    /**
     * Get name of this medicine.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get all prescriptions of this medicine.
     *
     * @return prescriptions
     */
    public Collection<Prescription> getPrescription() {
        return prescriptions;
    }

    /**
     * Add a prescription to the medicine.
     *
     * @param prescription to be added.
     */
    public void addPrescription(final Prescription prescription) {
        this.prescriptions.add(prescription);
    }
}
