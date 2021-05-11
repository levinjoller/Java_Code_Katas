/**
 * This class provides unit tests for the medicineclash package.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class MedicineClashTest {

    /** Return an empty list for a patient without medicines. */
    @Test
    public void clashPatientWithoutMedicinesReturnEmptyList() {
        // Arrange
        Patient patient = new Patient();
        Collection<String> medicineNames = new ArrayList<String>();
        int daysBack = 0;
        // Act
        var actual = patient.clash(medicineNames, daysBack);
        // Assert
        assertTrue(actual.isEmpty());
    }

    /**  */
}
