/**
 * LassoSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.chemspider;

public class LassoSearch  implements java.io.Serializable {
    private com.chemspider.LassoSearchOptions options;

    private com.chemspider.CommonSearchOptions commonOptions;

    private java.lang.String token;

    public LassoSearch() {
    }

    public LassoSearch(
           com.chemspider.LassoSearchOptions options,
           com.chemspider.CommonSearchOptions commonOptions,
           java.lang.String token) {
           this.options = options;
           this.commonOptions = commonOptions;
           this.token = token;
    }


    /**
     * Gets the options value for this LassoSearch.
     * 
     * @return options
     */
    public com.chemspider.LassoSearchOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this LassoSearch.
     * 
     * @param options
     */
    public void setOptions(com.chemspider.LassoSearchOptions options) {
        this.options = options;
    }


    /**
     * Gets the commonOptions value for this LassoSearch.
     * 
     * @return commonOptions
     */
    public com.chemspider.CommonSearchOptions getCommonOptions() {
        return commonOptions;
    }


    /**
     * Sets the commonOptions value for this LassoSearch.
     * 
     * @param commonOptions
     */
    public void setCommonOptions(com.chemspider.CommonSearchOptions commonOptions) {
        this.commonOptions = commonOptions;
    }


    /**
     * Gets the token value for this LassoSearch.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this LassoSearch.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LassoSearch)) return false;
        LassoSearch other = (LassoSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.commonOptions==null && other.getCommonOptions()==null) || 
             (this.commonOptions!=null &&
              this.commonOptions.equals(other.getCommonOptions()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getCommonOptions() != null) {
            _hashCode += getCommonOptions().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LassoSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.chemspider.com/", ">LassoSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.chemspider.com/", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.chemspider.com/", "LassoSearchOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.chemspider.com/", "commonOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.chemspider.com/", "CommonSearchOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.chemspider.com/", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
