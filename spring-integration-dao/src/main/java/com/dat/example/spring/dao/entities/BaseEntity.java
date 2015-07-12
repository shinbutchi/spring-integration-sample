package com.dat.example.spring.dao.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 772750961015024981L;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date created = Calendar.getInstance().getTime();
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_updated")
    @LastModifiedDate
    private Date lastUpdated = Calendar.getInstance().getTime();
    @Column(name = "version_no")
    private Long versionNo = 0l;
    private boolean deleted = false;

    public void updateLastUpdated() {
        lastUpdated = Calendar.getInstance().getTime();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

}
