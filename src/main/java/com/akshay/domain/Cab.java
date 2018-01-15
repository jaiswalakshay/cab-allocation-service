
package com.akshay.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Cab {

    @SerializedName("cab_id")
    @Expose
    private String cabId;
    @SerializedName("cost")
    @Expose
    private Integer cost;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;

    public String getCabId() {
        return cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(capacity).append(cost).append(cabId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cab) == false) {
            return false;
        }
        Cab rhs = ((Cab) other);
        return new EqualsBuilder().append(capacity, rhs.capacity).append(cost, rhs.cost).append(cabId, rhs.cabId).isEquals();
    }

}