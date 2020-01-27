package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employer extends AbstractEntity {

@NotBlank
@Size(min=3,max=20)
private String location;

public Employer(){}

    public Employer(@NotBlank @Size(min = 3, max = 20) String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
