
package com.akshay.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "team_member_id",
        "gender",
        "drop_point"
})
@Entity
public class TeamMember {

    @JsonProperty("team_member_id")
    @Id
    private String teamMemberId;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("drop_point")
    private String dropPoint;

    @JsonProperty("team_member_id")
    public String getTeamMemberId() {
        return teamMemberId;
    }

    @JsonProperty("team_member_id")
    public void setTeamMemberId(String teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("drop_point")
    public String getDropPoint() {
        return dropPoint;
    }

    @JsonProperty("drop_point")
    public void setDropPoint(String dropPoint) {
        this.dropPoint = dropPoint;
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dropPoint).append(teamMemberId).append(gender).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamMember) == false) {
            return false;
        }
        TeamMember rhs = ((TeamMember) other);
        return new EqualsBuilder().append(dropPoint, rhs.dropPoint).append(teamMemberId, rhs.teamMemberId).append(gender, rhs.gender).isEquals();
    }

}