package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity{

//    private String employer;
    @ManyToOne
    private Employer employer;

    //private String skills;

    @ManyToMany
    private List<Skill> skills;


    public Job() {

    }

    public Job(Employer employer,List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills=skills;

    }



    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }



    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public void addSkill(List<Skill> skill){
//        this.skills.add((Skill) skill);
//
//    }
}
