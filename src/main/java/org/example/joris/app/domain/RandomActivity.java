package org.example.joris.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
public class RandomActivity {

    @Id
    @GeneratedValue
    private Long id;

    private int trekking;

    private ZonedDateTime dateTime;

    private String naam;

    public RandomActivity() {
    }

    public RandomActivity(int trekking, ZonedDateTime dateTime, String naam) {
        this.trekking = trekking;
        this.dateTime = dateTime;
        this.naam = naam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTrekking() {
        return trekking;
    }

    public void setTrekking(int trekking) {
        this.trekking = trekking;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "RandomActivity{" +
                "id=" + id +
                ", trekking=" + trekking +
                ", dateTime=" + dateTime +
                ", naam='" + naam + '\'' +
                '}';
    }
}
