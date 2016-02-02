/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit230.lehisJourney.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author AllenMac
 */
public class Actor implements Serializable{
    
    private String name;
    private double role;

    public Actor() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRole() {
        return role;
    }

    public void setRole(double role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.role) ^ (Double.doubleToLongBits(this.role) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", role=" + role + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.role) != Double.doubleToLongBits(other.role)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public void setRole(String father) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
