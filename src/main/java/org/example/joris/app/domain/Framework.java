package org.example.joris.app.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Framework {
    @Id
    private int id;
    private String name;
    private String logo;
    private int score;

    public Framework(int id, String name, String logo, int score) {
        setId(id);
        setName(name);
        setLogo(logo);
        setScore(score);
    }

    public Framework() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Framework{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", score=" + score +
                '}';
    }
}
