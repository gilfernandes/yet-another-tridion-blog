
package com.sdltridion.contentmanager.coreservice._2011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sdltridion.contentmanager.r6.IdentifiableObjectData;


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
 *         &lt;element name="TryCheckOutResult" type="{http://www.sdltridion.com/ContentManager/R6}IdentifiableObjectData" minOccurs="0"/>
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
    "tryCheckOutResult"
})
@XmlRootElement(name = "TryCheckOutResponse")
public class TryCheckOutResponse {

    @XmlElement(name = "TryCheckOutResult", nillable = true)
    protected IdentifiableObjectData tryCheckOutResult;

    /**
     * Gets the value of the tryCheckOutResult property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiableObjectData }
     *     
     */
    public IdentifiableObjectData getTryCheckOutResult() {
        return tryCheckOutResult;
    }

    /**
     * Sets the value of the tryCheckOutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiableObjectData }
     *     
     */
    public void setTryCheckOutResult(IdentifiableObjectData value) {
        this.tryCheckOutResult = value;
    }

}
