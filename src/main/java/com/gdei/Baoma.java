package com.gdei;

public class Baoma implements Car{
   private double size;
   private String grand;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getGrand() {
        return grand;
    }

    public void setGrand(String grand) {
        this.grand = grand;
    }

    @Override
    public String toString() {
        return "Baoma{" +
                "size=" + size +
                ", grand='" + grand + '\'' +
                '}';
    }
}
