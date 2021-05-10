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
import java.util.List;

import org.junit.jupiter.api.Test;

public class MedicineClashTest {

    /** Return empty list for a patient without medication. */
    @Test
    public void clashPatientWothoutMedicationReturnEmptyList() {
        // Arrange
        Patient patient = new Patient();
        List<Medicine> medicine = new ArrayList<Medicine>();
        int days = 0;
        // Act
        var actual = patient.clash(medicine, days);
        // Assert
        assertTrue(actual.isEmpty());
    }
}
