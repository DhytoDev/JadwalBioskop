package com.bekup.jadwalbioskop.model;

import com.bignerdranch.expandablerecyclerview.model.Parent;

import java.util.List;

/**
 * Created by TRIPOD STUDIO on 10/24/2016.
 */

public class Movie implements Parent<Schedule> {
    private String movie ;
    private String poster ;
    private String genre ;
    private String duration ;
    private List<Schedule> jadwal ;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Schedule> getJadwal() {
        return jadwal;
    }

    public void setJadwal(List<Schedule> jadwal) {
        this.jadwal = jadwal;
    }

    @Override
    public List<Schedule> getChildList() {
        return jadwal ;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
