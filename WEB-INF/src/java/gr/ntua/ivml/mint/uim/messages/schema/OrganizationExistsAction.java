//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.27 at 06:23:03 PM EEST 
//


package gr.ntua.ivml.mint.uim.messages.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationExistsAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationExistsAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="OrganizationExistsCommand" type="{}OrganizationExistsCommand"/>
 *         &lt;element name="OrganizationExistsResponse" type="{}OrganizationExistsResponse"/>
 *         &lt;element name="error" type="{}ErrorResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationExistsAction", propOrder = {
    "organizationExistsCommand",
    "organizationExistsResponse",
    "error"
})
public class OrganizationExistsAction {

    @XmlElement(name = "OrganizationExistsCommand")
    protected OrganizationExistsCommand organizationExistsCommand;
    @XmlElement(name = "OrganizationExistsResponse")
    protected OrganizationExistsResponse organizationExistsResponse;
    protected ErrorResponse error;

    /**
     * Gets the value of the organizationExistsCommand property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationExistsCommand }
     *     
     */
    public OrganizationExistsCommand getOrganizationExistsCommand() {
        return organizationExistsCommand;
    }

    /**
     * Sets the value of the organizationExistsCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationExistsCommand }
     *     
     */
    public void setOrganizationExistsCommand(OrganizationExistsCommand value) {
        this.organizationExistsCommand = value;
    }

    /**
     * Gets the value of the organizationExistsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationExistsResponse }
     *     
     */
    public OrganizationExistsResponse getOrganizationExistsResponse() {
        return organizationExistsResponse;
    }

    /**
     * Sets the value of the organizationExistsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationExistsResponse }
     *     
     */
    public void setOrganizationExistsResponse(OrganizationExistsResponse value) {
        this.organizationExistsResponse = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setError(ErrorResponse value) {
        this.error = value;
    }

}
