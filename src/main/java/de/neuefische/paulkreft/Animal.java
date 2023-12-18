package de.neuefische.paulkreft;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Animal {
    private String name;
    private LocalDate birthday;

    public LocalDate getNextBirthday() {
        LocalDate thisYearsBirthday = LocalDate.of(LocalDate.now().getYear(), birthday.getMonth(), birthday.getDayOfMonth());
        if(LocalDate.now().isBefore(thisYearsBirthday)) {
            return thisYearsBirthday;
        }

        return thisYearsBirthday.plusYears(1);
    }
}
