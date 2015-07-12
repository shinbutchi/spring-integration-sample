package com.dat.example.spring.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "client_account")
public class ClientAccount extends BaseEntity {
    private static final long serialVersionUID = -1664663954874853991L;
    @Id
    @Column(name = "terminal_id")
    private String terminalId;
    private String username;
    private String password;
    @Column(name = "account_non_expired")
    private boolean accountNonExpired;
    @Column(name = "account_non_locked")
    private boolean accountNonLocked;
    @Column(name = "credentials_non_expired")
    private boolean credentialsNonExpired;

    private boolean enabled;
    @Column(name = "last_passwords")
    private String lastPasswords;
    @Column(name = "attempt_password")
    private Integer attemptPassword;
    @Column(name = "attempt_reset_password")
    private Integer attemptResetPassword;
    @Column(name = "last_login_time")
    private Date lastLoginTime;
    @Column(name = "last_password_updated")
    private Date lastPasswordUpdated;

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getLastPasswords() {
        return lastPasswords;
    }

    public void setLastPasswords(String lastPasswords) {
        this.lastPasswords = lastPasswords;
    }

    public Integer getAttemptPassword() {
        return attemptPassword;
    }

    public void setAttemptPassword(Integer attemptPassword) {
        this.attemptPassword = attemptPassword;
    }

    public Integer getAttemptResetPassword() {
        return attemptResetPassword;
    }

    public void setAttemptResetPassword(Integer attemptResetPassword) {
        this.attemptResetPassword = attemptResetPassword;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastPasswordUpdated() {
        return lastPasswordUpdated;
    }

    public void setLastPasswordUpdated(Date lastPasswordUpdated) {
        this.lastPasswordUpdated = lastPasswordUpdated;
    }
}
