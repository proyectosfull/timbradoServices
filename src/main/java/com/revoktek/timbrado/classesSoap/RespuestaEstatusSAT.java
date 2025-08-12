
package com.revoktek.timbrado.classesSoap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaEstatusSAT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaEstatusSAT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CodigoEstatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EsCancelable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EstatusCancelacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaEstatusSAT", propOrder = {

})
public class RespuestaEstatusSAT {

    @XmlElement(name = "CodigoEstatus", required = true)
    protected String codigoEstatus;
    @XmlElement(name = "EsCancelable", required = true)
    protected String esCancelable;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "EstatusCancelacion", required = true)
    protected String estatusCancelacion;

    /**
     * Obtiene el valor de la propiedad codigoEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstatus() {
        return codigoEstatus;
    }

    /**
     * Define el valor de la propiedad codigoEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstatus(String value) {
        this.codigoEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad esCancelable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsCancelable() {
        return esCancelable;
    }

    /**
     * Define el valor de la propiedad esCancelable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsCancelable(String value) {
        this.esCancelable = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusCancelacion() {
        return estatusCancelacion;
    }

    /**
     * Define el valor de la propiedad estatusCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusCancelacion(String value) {
        this.estatusCancelacion = value;
    }

}
