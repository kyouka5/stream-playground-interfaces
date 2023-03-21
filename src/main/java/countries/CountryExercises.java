package countries;

import countries.model.Country;
import countries.repository.CountryRepository;

import java.util.List;

public class CountryExercises {
    private final List<Country> countries;

    public CountryExercises() {
        this.countries = new CountryRepository().getAll();
    }
}
