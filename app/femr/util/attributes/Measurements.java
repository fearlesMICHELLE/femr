package femr.util.attributes;

import play.mvc.WebSocket;

/**
 * Created by jonesm on 11/17/16.
 */
public class Measurements {
    private Integer heightFeet;
    private Integer heightInches;
    private Integer heightMeters;
    private Integer heightCentimeters;
    private Float weightLbs;
    private Float weightKgs;

    public Measurements(){
        this.heightFeet = 0;
        this.heightInches = 0;
        this.heightMeters = 0;
        this.heightCentimeters = 0;
        this.weightKgs = 0.0f;
        this.weightLbs = 0.0f;
    }

    public Integer getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(Integer heightFeet) {
        this.heightFeet = heightFeet;
    }

    public Integer getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(Integer heightInches) {
        this.heightInches = heightInches;
    }

    public Integer getHeightMeters() {
        return heightMeters;
    }

    public void setHeightMeters(Integer heightMeters) {
        this.heightMeters= heightMeters;
    }

    public Integer getHeightCentimeters() {
        return heightCentimeters;
    }

    public void setHeightCentimeters(Integer heightCentimeters) {
        this.heightCentimeters= heightCentimeters;
    }

    public Float getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(Float weight) {
        this.weightLbs = weight;
    }

    public Float getWeightKgs() {
        return weightKgs;
    }

    public void setWeightKgs(Float weightKgs) {
        this.weightKgs = weightKgs;
    }
}
