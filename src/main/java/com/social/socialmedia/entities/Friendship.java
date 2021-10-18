package com.social.socialmedia.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="friendship")
public class Friendship {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_sender")
    private User userSender;

    @ManyToOne
    @JoinColumn(name = " user_receiver")
    private User userReceiver;

    @Column(name = "accepted")
    private boolean accepted;

    @Column(name = "terminator")
    private boolean terminator;

    @Column(name = "request_date")
    private Date requestDate;

    @Column(name = "approve_date")
    private Date approveDate;

    @Column(name = "termination_date")
    private  Date terminationDate;

    public Friendship() {
    }

    public Friendship(User userSender, User userReceiver, boolean accepted, boolean terminator, Date requestDate, Date approveDate, Date terminationDate) {
        this.userSender = userSender;
        this.userReceiver = userReceiver;
        this.accepted = accepted;
        this.terminator = terminator;
        this.requestDate = requestDate;
        this.approveDate = approveDate;
        this.terminationDate = terminationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserSender() {
        return userSender;
    }

    public void setUserSender(User userSender) {
        this.userSender = userSender;
    }

    public User getUserReciever() {
        return userReceiver;
    }

    public void setUserReciever(User userReciever) {
        this.userReceiver = userReciever;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isTerminator() {
        return terminator;
    }

    public void setTerminator(boolean terminator) {
        this.terminator = terminator;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }
}
