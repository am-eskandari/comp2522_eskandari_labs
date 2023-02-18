/**
 * Guppy.
 *
 * @author Amir Eskandari
 * @version 202310
 */
package ca.bcit.comp2522.lab01;
import java.lang.Math;



public class Guppy {
    // Fill this class with your code.

    // Symbolic constants
    public static final int FIRST_GENERATION = 0;
    public static final int YOUNG_FISH_AGE_IN_WEEKS = 10;
    public static final int MATURE_FISH_AGE_IN_WEEKS = 30;
    public static final int MAXIMUM_AGE_IN_WEEKS = 50;
    public static final double MINIMUM_WATER_VOLUME_ML = 250.0;
    public static final String DEFAULT_GENUS = "Poecilia";
    public static final String DEFAULT_SPECIES = "reticulata";
    public static final double DEFAULT_HEALTH_COEFFICIENT = 0.5;
    public static final double MINIMUM_HEALTH_COEFFICIENT = 0.0;
    public static final double MAXIMUM_HEALTH_COEFFICIENT = 1.0;
    // Instance variables
    private String genus;
    private String species;
    private int ageInWeeks;
    private boolean isFemale;
    private int generationNumber;
    private boolean isAlive;
    private double healthCoefficient;

    private int identificationNumber;

    // Static variable
    private static int numberOfGuppiesBorn = 0;


    // Zero-parameter constructor
    public Guppy() {
        numberOfGuppiesBorn++;
        this.identificationNumber = numberOfGuppiesBorn;
        this.genus = DEFAULT_GENUS;
        this.species = DEFAULT_SPECIES;
        this.isFemale = true;
        this.isAlive = true;
        this.healthCoefficient = DEFAULT_HEALTH_COEFFICIENT;
        this.ageInWeeks = 0;
        this.generationNumber = 0;
    }

    public Guppy(String newGenus,
                 String newSpecies,
                 int newAgeInWeeks,
                 boolean newIsFemale,
                 int newGenerationNumber,
                 double newHealthCoefficient) {
        numberOfGuppiesBorn++;
        this.identificationNumber = numberOfGuppiesBorn;
        this.genus = (newGenus != null && !newGenus.trim().isEmpty()) ?
                newGenus.trim().substring(0,1).toUpperCase()+
                        newGenus.trim().substring(1).toLowerCase() : "Poecilia";
        this.species = (newSpecies != null && !newSpecies.trim().isEmpty()) ?
                newSpecies.trim().toLowerCase() : "reticulata";
        this.ageInWeeks = (newAgeInWeeks <= MAXIMUM_AGE_IN_WEEKS) ? Math.max(newAgeInWeeks, 0) : MAXIMUM_AGE_IN_WEEKS;
        this.isFemale = newIsFemale;
        this.generationNumber = Math.max(newGenerationNumber, 0);
        this.isAlive = (newHealthCoefficient >= MINIMUM_HEALTH_COEFFICIENT) &&
                (newHealthCoefficient <= MAXIMUM_HEALTH_COEFFICIENT);
        this.healthCoefficient = (Math.min(Math.max(newHealthCoefficient, MINIMUM_HEALTH_COEFFICIENT),
                MAXIMUM_HEALTH_COEFFICIENT));
    }

    public void incrementAge() {

        this.ageInWeeks++;

        if (this.ageInWeeks > MAXIMUM_AGE_IN_WEEKS) {
            this.isAlive = false;
        }
    }

    public static int getNumberOfGuppiesBorn() {
        return numberOfGuppiesBorn;
    }
    public String getGenus() {
        return genus;
    }
    public String getSpecies() {
        return species;
    }
    public int getAgeInWeeks() {
        return ageInWeeks;
    }
    public void setAgeInWeeks(int ageInWeeks) {
        if (ageInWeeks >= 0 && ageInWeeks <= MAXIMUM_AGE_IN_WEEKS){
            if(isAlive){
                this.ageInWeeks = ageInWeeks;
            }
        }
    }
    public boolean getIsFemale() {
        return isFemale;
    }
    public int getGenerationNumber() {
        return generationNumber;
    }
    public boolean getIsAlive() {
        return isAlive;
    }
    public void setIsAlive(boolean isAlive) {

        if (this.isAlive){
            this.isAlive = isAlive;
        }

    }
    public double getHealthCoefficient() {
        return healthCoefficient;
    }
    public void setHealthCoefficient(double healthCoefficient) {
        if (healthCoefficient >= MINIMUM_HEALTH_COEFFICIENT && healthCoefficient <= MAXIMUM_HEALTH_COEFFICIENT){
            this.healthCoefficient = healthCoefficient;
        }
    }
    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public double getVolumeNeeded() {
        if (this.ageInWeeks < YOUNG_FISH_AGE_IN_WEEKS) {
            return MINIMUM_WATER_VOLUME_ML;
        } else if (this.ageInWeeks <= MATURE_FISH_AGE_IN_WEEKS) {
            return MINIMUM_WATER_VOLUME_ML * this.ageInWeeks / YOUNG_FISH_AGE_IN_WEEKS;
        } else if (this.ageInWeeks <= MAXIMUM_AGE_IN_WEEKS) {
            return MINIMUM_WATER_VOLUME_ML * 1.5;
        } else {
            return 0.0;
        }
    }
        public void changeHealthCoefficient(double delta) {
            this.healthCoefficient += delta;
            if (this.healthCoefficient <= MINIMUM_HEALTH_COEFFICIENT) {
                this.healthCoefficient = 0.0;
                this.isAlive = false;
            } else if (this.healthCoefficient > MAXIMUM_HEALTH_COEFFICIENT) {
                this.healthCoefficient = MAXIMUM_HEALTH_COEFFICIENT;
            }
    }

    @Override
    public String toString() {
        return "Guppy{" +
                "genus='" + genus + '\'' +
                ", species='" + species + '\'' +
                ", ageInWeeks=" + ageInWeeks +
                ", isFemale=" + isFemale +
                ", generationNumber=" + generationNumber +
                ", isAlive=" + isAlive +
                ", healthCoefficient=" + healthCoefficient +
                ", identificationNumber=" + identificationNumber +
                '}';
    }
}
