
package com.akshay.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Route {

    @SerializedName("cab_id")
    @Expose
    private String cabId;
    @SerializedName("team_member_ids")
    @Expose
    private String teamMemberIds;
    @SerializedName("route")
    @Expose
    private String route;
    @SerializedName("route_cost")
    @Expose
    private int routeCost;

    public String getCabId() {
        return cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public String getTeamMemberIds() {
        return teamMemberIds;
    }

    public void setTeamMemberIds(String teamMemberIds) {
        this.teamMemberIds = teamMemberIds;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getRouteCost() {
        return routeCost;
    }

    public void setRouteCost(Integer routeCost) {
        this.routeCost = routeCost;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(route).append(teamMemberIds).append(routeCost).append(cabId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Route) == false) {
            return false;
        }
        Route rhs = ((Route) other);
        return new EqualsBuilder().append(route, rhs.route).append(teamMemberIds, rhs.teamMemberIds).append(routeCost, rhs.routeCost).append(cabId, rhs.cabId).isEquals();
    }

}