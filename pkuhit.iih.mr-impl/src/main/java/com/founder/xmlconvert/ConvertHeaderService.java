
package com.founder.xmlconvert;

import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ConvertHeaderService", targetNamespace = "xmlconvert.founder.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConvertHeaderService {


    /**
     * 
     * @param sourceJson
     * @param xmlTemplate
     * @param student
     * @param xmlContent
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convert", targetNamespace = "xmlconvert.founder.com", className = "com.founder.xmlconvert.Convert")
    @ResponseWrapper(localName = "convertResponse", targetNamespace = "xmlconvert.founder.com", className = "com.founder.xmlconvert.ConvertResponse")
    public String convert(
        @WebParam(name = "xmlContent", targetNamespace = "")
        String xmlContent,
        @WebParam(name = "sourceJson", targetNamespace = "")
        String sourceJson,
        @WebParam(name = "xmlTemplate", targetNamespace = "")
        String xmlTemplate,
        @WebParam(name = "student", targetNamespace = "")
        Boolean student);
    
    /**
     * 
     * @param sourceJson
     * @param xmlTemplate
     * @param student
     * @param xmlContent
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMq", targetNamespace = "xmlconvert.founder.com", className = "com.founder.xmlconvert.sendMq")
    @ResponseWrapper(localName = "sendMqResponse", targetNamespace = "xmlconvert.founder.com", className = "com.founder.xmlconvert.sendMqResponse")
    public String sendMq(
        @WebParam(name = "xmlContent", targetNamespace = "")
        String xmlContent);

}