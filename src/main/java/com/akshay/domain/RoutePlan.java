

package com.akshay.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.List;

public class RoutePlan {

    @SerializedName("total_cost")
    @Expose
    private int totalCost;
    @SerializedName("routes")
    @Expose
    private List<Route> routes = null;

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalCost).append(routes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoutePlan) == false) {
            return false;
        }
        RoutePlan rhs = ((RoutePlan) other);
        return new EqualsBuilder().append(totalCost, rhs.totalCost).append(routes, rhs.routes).isEquals();
    }
}

