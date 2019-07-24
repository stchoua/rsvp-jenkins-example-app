package com.trilogyed.rsvp.dao;

import com.trilogyed.rsvp.model.Rsvp;

import java.util.List;

public interface RsvpDao {

    Rsvp addRsvp(Rsvp rsvp);

    Rsvp getRsvp(int id);

    List<Rsvp> getAllRsvps();

    void updateRsvp(Rsvp rsvp);

    void deleteRsvp(int id);

}
