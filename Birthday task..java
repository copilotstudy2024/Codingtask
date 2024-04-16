import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class BirthdayCalculator {
    public static void main(String[] args) {
        String birthdayString = "25041998"; // Example birthday input
        Birthday birthday = new Birthday(birthdayString);
        int daysUntilNextBirthday = birthday.getDaysUntilNextBirthday();
        System.out.println("Days until your next birthday: " + daysUntilNextBirthday);
    }
}

class Birthday {
    
}