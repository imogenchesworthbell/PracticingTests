package org.example.Drug;

public record DispensableDrug(String drugName, DrugClassification[] drugClassifications, boolean isControlled) {
}