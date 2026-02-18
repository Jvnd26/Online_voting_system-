package com.example.voting.model;

import jakarta.persistence.*;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String party;
    private int votes = 0;

    public Candidate() {}

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getParty() { return party; }
    public int getVotes() { return votes; }

    public void setVotes(int votes) { this.votes = votes; }
}
