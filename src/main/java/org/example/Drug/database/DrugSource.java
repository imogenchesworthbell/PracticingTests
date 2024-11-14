package org.example.Drug.database;

import java.util.List;

public interface DrugSource {
    List<DrugRecord> findDrugsStartingWith(String startingString);
}
