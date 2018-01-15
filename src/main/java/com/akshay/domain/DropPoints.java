package com.akshay.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class DropPoints {


    @SerializedName("target_headquarter")
    @Expose
    private String targetHeadquarter;
    @SerializedName("pointA")
    @Expose
    private String pointA;
    @SerializedName("pointB")
    @Expose
    private String pointB;
    @SerializedName("pointC")
    @Expose
    private String pointC;
    @SerializedName("pointD")
    @Expose
    private String pointD;
    @SerializedName("pointE")
    @Expose
    private String pointE;

    public String getTargetHeadquarter() {
        return targetHeadquarter;
    }

    public void setTargetHeadquarter(String targetHeadquarter) {
        this.targetHeadquarter = targetHeadquarter;
    }

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public String getPointC() {
        return pointC;
    }

    public void setPointC(String pointC) {
        this.pointC = pointC;
    }

    public String getPointD() {
        return pointD;
    }

    public void setPointD(String pointD) {
        this.pointD = pointD;
    }

    public String getPointE() {
        return pointE;
    }

    public void setPointE(String pointE) {
        this.pointE = pointE;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetHeadquarter).append(pointE).append(pointD).append(pointA).append(pointC).append(pointB).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DropPoints) == false) {
            return false;
        }
        DropPoints rhs = ((DropPoints) other);
        return new EqualsBuilder().append(targetHeadquarter, rhs.targetHeadquarter).append(pointE, rhs.pointE).append(pointD, rhs.pointD).append(pointA, rhs.pointA).append(pointC, rhs.pointC).append(pointB, rhs.pointB).isEquals();
    }


}
