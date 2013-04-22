
package com.sdltridion.contentmanager.coreservice._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.sdltridion.contentmanager.r6.ProcessDefinitionType;


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
 *         &lt;element name="itemIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="processDefinitionType" type="{http://www.sdltridion.com/ContentManager/R6}ProcessDefinitionType" minOccurs="0"/>
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
    "itemIds",
    "processDefinitionType"
})
@XmlRootElement(name = "GetProcessDefinitionsForItems")
public class GetProcessDefinitionsForItems {

    @XmlElement(nillable = true)
    protected ArrayOfstring itemIds;
    protected ProcessDefinitionType processDefinitionType;

    /**
     * Gets the value of the itemIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getItemIds() {
        return itemIds;
    }

    /**
     * Sets the value of the itemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setItemIds(ArrayOfstring value) {
        this.itemIds = value;
    }

    /**
     * Gets the value of the processDefinitionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessDefinitionType }
     *     
     */
    public ProcessDefinitionType getProcessDefinitionType() {
        return processDefinitionType;
    }

    /**
     * Sets the value of the processDefinitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessDefinitionType }
     *     
     */
    public void setProcessDefinitionType(ProcessDefinitionType value) {
        this.processDefinitionType = value;
    }

}
