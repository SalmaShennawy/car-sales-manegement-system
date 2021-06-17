/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalessystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Abduallah Hussien
 */
@Entity
@Table(name = "CARS", catalog = "", schema = "HR")
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c")
    , @NamedQuery(name = "Cars.findByCarId", query = "SELECT c FROM Cars c WHERE c.carId = :carId")
    , @NamedQuery(name = "Cars.findByCarModel", query = "SELECT c FROM Cars c WHERE c.carModel = :carModel")
    , @NamedQuery(name = "Cars.findByCarColour", query = "SELECT c FROM Cars c WHERE c.carColour = :carColour")
    , @NamedQuery(name = "Cars.findByCarPrice", query = "SELECT c FROM Cars c WHERE c.carPrice = :carPrice")})
public class Cars implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAR_ID")
    private Integer carId;
    @Basic(optional = false)
    @Column(name = "CAR_MODEL")
    private String carModel;
    @Basic(optional = false)
    @Column(name = "CAR_COLOUR")
    private String carColour;
    @Basic(optional = false)
    @Column(name = "CAR_PRICE")
    private BigInteger carPrice;

    public Cars() {
    }

    public Cars(Integer carId) {
        this.carId = carId;
    }

    public Cars(Integer carId, String carModel, String carColour, BigInteger carPrice) {
        this.carId = carId;
        this.carModel = carModel;
        this.carColour = carColour;
        this.carPrice = carPrice;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        Integer oldCarId = this.carId;
        this.carId = carId;
        changeSupport.firePropertyChange("carId", oldCarId, carId);
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        String oldCarModel = this.carModel;
        this.carModel = carModel;
        changeSupport.firePropertyChange("carModel", oldCarModel, carModel);
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        String oldCarColour = this.carColour;
        this.carColour = carColour;
        changeSupport.firePropertyChange("carColour", oldCarColour, carColour);
    }

    public BigInteger getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(BigInteger carPrice) {
        BigInteger oldCarPrice = this.carPrice;
        this.carPrice = carPrice;
        changeSupport.firePropertyChange("carPrice", oldCarPrice, carPrice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carId != null ? carId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.carId == null && other.carId != null) || (this.carId != null && !this.carId.equals(other.carId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carssalessystem.Cars[ carId=" + carId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
