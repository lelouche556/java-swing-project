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
@Table(name = "issue_books", catalog = "gaurav", schema = "")
@NamedQueries({
    @NamedQuery(name = "IssueBooks.findAll", query = "SELECT i FROM IssueBooks i")
    , @NamedQuery(name = "IssueBooks.findById", query = "SELECT i FROM IssueBooks i WHERE i.id = :id")
    , @NamedQuery(name = "IssueBooks.findByCallNo", query = "SELECT i FROM IssueBooks i WHERE i.callNo = :callNo")
    , @NamedQuery(name = "IssueBooks.findByStudentid", query = "SELECT i FROM IssueBooks i WHERE i.studentid = :studentid")
    , @NamedQuery(name = "IssueBooks.findByStudentname", query = "SELECT i FROM IssueBooks i WHERE i.studentname = :studentname")
    , @NamedQuery(name = "IssueBooks.findByContact", query = "SELECT i FROM IssueBooks i WHERE i.contact = :contact")})
public class IssueBooks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "call_no")
    private String callNo;
    @Column(name = "Student_id")
    private Integer studentid;
    @Column(name = "Student_name")
    private String studentname;
    @Column(name = "contact")
    private BigInteger contact;

    public IssueBooks() {
    }

    public IssueBooks(Integer id) {
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

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        String oldCallNo = this.callNo;
        this.callNo = callNo;
        changeSupport.firePropertyChange("callNo", oldCallNo, callNo);
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        Integer oldStudentid = this.studentid;
        this.studentid = studentid;
        changeSupport.firePropertyChange("studentid", oldStudentid, studentid);
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        String oldStudentname = this.studentname;
        this.studentname = studentname;
        changeSupport.firePropertyChange("studentname", oldStudentname, studentname);
    }

    public BigInteger getContact() {
        return contact;
    }

    public void setContact(BigInteger contact) {
        BigInteger oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
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
        if (!(object instanceof IssueBooks)) {
            return false;
        }
        IssueBooks other = (IssueBooks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "swing.jframe.IssueBooks[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
