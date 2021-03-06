/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.wavemaker.sampleapps.web.wavecalendar.eventdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Events generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`EVENTS`")
public class Events implements Serializable {

    private Integer id;
    private Timestamp start;
    private Timestamp end;
    private Boolean allDay;
    private String title;
    private String url;
    private String description;
    private String color;
    private Integer userid;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`START`", nullable = true)
    public Timestamp getStart() {
        return this.start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    @Column(name = "`END`", nullable = true)
    public Timestamp getEnd() {
        return this.end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    @Column(name = "`ALL_DAY`", nullable = true)
    public Boolean getAllDay() {
        return this.allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    @Column(name = "`TITLE`", nullable = false, length = 255)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "`URL`", nullable = true, length = 255)
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "`DESCRIPTION`", nullable = true, length = 255)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "`COLOR`", nullable = true, length = 255)
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "`USERID`", nullable = true, scale = 0, precision = 10)
    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`USERID`", referencedColumnName = "`USERID`", insertable = false, updatable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        if(user != null) {
            this.userid = user.getUserid();
        }

        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Events)) return false;
        final Events events = (Events) o;
        return Objects.equals(getId(), events.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

