package com.mycompany.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "hpm_tickets")
public class TicketGLPI implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int entities_id;
    private String name;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date closedate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date solvedate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date_mod;
    private int users_id_lastupdater;
    private int status;
    private int users_id_recipient;
    private int requesttypes_id;
    private String itemtype;
    private int items_id;
    private String content;
    private int urgency;
    private int impact;
    private int priority;
    private int itilcategories_id;
    private int type;
    private int solutiontypes_id;
    private String solution;
    private int global_validation;
    private int slas_id;
    private int slalevels_id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date due_date;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date begin_waiting_date;
    private int sla_waiting_duration;
    private int waiting_duration;
    private int close_delay_stat;
    private int solve_delay_stat;
    private int takeintoaccount_delay_stat;
    private int actiontime;
    private String is_deleted;
    private int locations_id;
    private int validation_percent;

    // Getters
    public int getId() {
        return id;
    }

    public int getEntities_id() {
        return entities_id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Date getClosedate() {
        return closedate;
    }

    public Date getSolvedate() {
        return solvedate;
    }

    public Date getDate_mod() {
        return date_mod;
    }

    public int getUsers_id_lastupdater() {
        return users_id_lastupdater;
    }

    public int getStatus() {
        return status;
    }

    public int getUsers_id_recipient() {
        return users_id_recipient;
    }

    public int getRequesttypes_id() {
        return requesttypes_id;
    }

    public String getItemtype() {
        return itemtype;
    }

    public int getItems_id() {
        return items_id;
    }

    public String getContent() {
        return content;
    }

    public int getUrgency() {
        return urgency;
    }

    public int getImpact() {
        return impact;
    }

    public int getPriority() {
        return priority;
    }

    public int getItilcategories_id() {
        return itilcategories_id;
    }

    public int getType() {
        return type;
    }

    public int getSolutiontypes_id() {
        return solutiontypes_id;
    }

    public String getSolution() {
        return solution;
    }

    public int getGlobal_validation() {
        return global_validation;
    }

    public int getSlas_id() {
        return slas_id;
    }

    public int getSlalevels_id() {
        return slalevels_id;
    }

    public Date getDue_date() {
        return due_date;
    }

    public Date getBegin_waiting_date() {
        return begin_waiting_date;
    }

    public int getSla_waiting_duration() {
        return sla_waiting_duration;
    }

    public int getWaiting_duration() {
        return waiting_duration;
    }

    public int getClose_delay_stat() {
        return close_delay_stat;
    }

    public int getSolve_delay_stat() {
        return solve_delay_stat;
    }

    public int getTakeintoaccount_delay_stat() {
        return takeintoaccount_delay_stat;
    }

    public int getActiontime() {
        return actiontime;
    }

    public String getIs_deleted() {
        return is_deleted;
    }

    public int getLocations_id() {
        return locations_id;
    }

    public int getValidation_percent() {
        return validation_percent;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEntities_id(int entities_id) {
        this.entities_id = entities_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public void setSolvedate(Date solvedate) {
        this.solvedate = solvedate;
    }

    public void setDate_mod(Date date_mod) {
        this.date_mod = date_mod;
    }

    public void setUsers_id_lastupdater(int users_id_lastupdater) {
        this.users_id_lastupdater = users_id_lastupdater;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUsers_id_recipient(int users_id_recipient) {
        this.users_id_recipient = users_id_recipient;
    }

    public void setRequesttypes_id(int requesttypes_id) {
        this.requesttypes_id = requesttypes_id;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setItilcategories_id(int itilcategories_id) {
        this.itilcategories_id = itilcategories_id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setSolutiontypes_id(int solutiontypes_id) {
        this.solutiontypes_id = solutiontypes_id;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public void setGlobal_validation(int global_validation) {
        this.global_validation = global_validation;
    }

    public void setSlas_id(int slas_id) {
        this.slas_id = slas_id;
    }

    public void setSlalevels_id(int slalevels_id) {
        this.slalevels_id = slalevels_id;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public void setBegin_waiting_date(Date begin_waiting_date) {
        this.begin_waiting_date = begin_waiting_date;
    }

    public void setSla_waiting_duration(int sla_waiting_duration) {
        this.sla_waiting_duration = sla_waiting_duration;
    }

    public void setWaiting_duration(int waiting_duration) {
        this.waiting_duration = waiting_duration;
    }

    public void setClose_delay_stat(int close_delay_stat) {
        this.close_delay_stat = close_delay_stat;
    }

    public void setSolve_delay_stat(int solve_delay_stat) {
        this.solve_delay_stat = solve_delay_stat;
    }

    public void setTakeintoaccount_delay_stat(int takeintoaccount_delay_stat) {
        this.takeintoaccount_delay_stat = takeintoaccount_delay_stat;
    }

    public void setActiontime(int actiontime) {
        this.actiontime = actiontime;
    }

    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted;
    }

    public void setLocations_id(int locations_id) {
        this.locations_id = locations_id;
    }

    public void setValidation_percent(int validation_percent) {
        this.validation_percent = validation_percent;
    }

}
