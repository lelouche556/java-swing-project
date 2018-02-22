/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.jframe;

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
 * @author Gaurav556
 */
@Entity
@Table(name = "librarian", catalog = "gaurav", schema = "")
@NamedQueries({
    @NamedQuery(name = "Librarian.findAll", query = "SELECT l FROM Librarian l")
    , @NamedQuery(name = "Librarian.findById", query = "SELECT l FROM Librarian l WHERE l.id = :id")
    , @NamedQuery(name = "Librarian.findByName", query = "SELECT l FROM Librarian l WHERE l.name = :name")
    , @NamedQuery(name = "Librarian.findByPassword", query = "SELECT l FROM Librarian l WHERE l.password = :password")
    , @NamedQuery(name = "Librarian.findByEmailId", query = "SELECT l FROM Librarian l WHERE l.emailId = :emailId")
    , @NamedQuery(name = "Librarian.findByAddress", query = "SELECT l FROM Librarian l WHERE l.address = :address")
    , @NamedQuery(name = "Librarian.findByCity", query = "SELECT l FROM Librarian l WHERE l.city = :city")
    , @NamedQuery(name = "Librarian.findByPhoneNo", query = "SELECT l FROM Librarian l WHERE l.phoneNo = :phoneNo")})
public class Librarian implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_no")
    private BigInteger phoneNo;

    public Librarian() {
    }

    public Librarian(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        String oldEmailId = this.emailId;
        this.emailId = emailId;
        changeSupport.firePropertyChange("emailId", oldEmailId, emailId);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public BigInteger getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(BigInteger phoneNo) {
        BigInteger oldPhoneNo = this.phoneNo;
        this.phoneNo = phoneNo;
        changeSupport.firePropertyChange("phoneNo", oldPhoneNo, phoneNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Librarian)) {
            return false;
        }
        Librarian other = (Librarian) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "swing.jframe.Librarian[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
