//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.16 at 05:09:28 PM MSK 
//


package by.it.seroglazov.jd02_09.beans.ingredients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingredient" type="{http://generate.jd02_09.seroglazov.it.by/ingredients}Ingredient" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ingredient"
})
@XmlRootElement(name = "ingredients")
public class Ingredients implements Serializable {

    @XmlElement(required = true)
    protected List<Ingredient> ingredient;

    public Ingredients() {
    }

    @Override
    public String toString() {
        if (ingredient != null && ingredient.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ingredients: [\n              ");
            ingredient.forEach(x -> sb.append(x).append("\n              "));
            //sb.delete(sb.length()-2, sb.length());
            sb.deleteCharAt(sb.length()-1).append("]");
            return sb.toString();
        } else {
            return "Ingredients: []";
        }
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ingredient }
     * 
     * 
     */
    public List<Ingredient> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<Ingredient>();
        }
        return this.ingredient;
    }

}