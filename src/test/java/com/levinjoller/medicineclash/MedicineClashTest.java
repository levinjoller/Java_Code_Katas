/**
 * This class provides unit tests for the medicineclash package.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-10
 */

package com.levinjoller.medicineclash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class MedicineClashTest {

    /**
     * Return empty list when no medicine is passed to check.
     */
    @Test
    public void shouldReturnEmptyListWhenNoMedicinePassed() {
        // Arrange
        Patient patient = new Patient();
        Collection<String> medicineNames = null;
        int daysBack = 0;
        // Act
        Collection<LocalDate> actual = patient.clash(medicineNames, daysBack);
        // Assert
        assertTrue(actual.isEmpty());
    }

    /**
     * Return dispense day of prescription when clash and dispense is today.
     */
    @Test
    public void shouldReturnDispenseDateWhenClashAndDispenseIsToday() {
        // Arrange
        LocalDate dispenseDate = LocalDate.now();
        final int daysSupply = 10;
        String medicineName = "Aspirin";

        Prescription prescription = new Prescription(dispenseDate, daysSupply);
        Medicine medicine = new Medicine(medicineName);
        medicine.addPrescription(prescription);
        Patient patient = new Patient();
        patient.addMedicine(medicine);

        Collection<String> medicineNames = new ArrayList<>();
        medicineNames.add(medicineName);
        final int daysBack = 3;
        // Act
        Collection<LocalDate> actual = patient.clash(medicineNames, daysBack);
        // Assert
        assertEquals(1, actual.size());
        assertTrue(actual.contains(dispenseDate));
    }
}
