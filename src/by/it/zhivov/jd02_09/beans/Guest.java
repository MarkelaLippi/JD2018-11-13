//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.17 at 12:09:52 AM MSK 
//


package by.it.zhivov.jd02_09.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Guest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Guest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="privelegy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guest", propOrder = {

})
public class Guest {

    protected boolean privelegy;

    public Guest() {
    }

    public Guest(boolean privelegy) {
        this.privelegy = privelegy;
    }

    /**
     * Gets the value of the privelegy property.
     */
    public boolean isPrivelegy() {
        return privelegy;
    }

    /**
     * Sets the value of the privelegy property.
     */
    public void setPrivelegy(boolean value) {
        this.privelegy = value;
    }

    @Override
    public String toString() {
        return "\n\tGuest {\n" +
                "\t\tprivelegy=" + privelegy +
                "\n\t\t}";
    }

}
