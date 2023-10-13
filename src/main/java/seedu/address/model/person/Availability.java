package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Availability {
    public final String value;

    public static final String MESSAGE_CONSTRAINTS = "Availability should be either 'Available' or 'NotAvailable'";

    public static final String VALIDATION_REGEX = "^(Available|NotAvailable|nil)$";

    public Availability(String value) {
        requireNonNull(value);
        checkArgument(isValidAvailability(value), MESSAGE_CONSTRAINTS);
        this.value = value;
    }

    public static boolean isValidAvailability(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Availability that = (Availability) other;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
