
package com.sdltridion.contentmanager.coreservice;

import javax.xml.ws.WebFault;
import com.sdltridion.contentmanager.r6.CoreServiceFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "CoreServiceFault", targetNamespace = "http://www.sdltridion.com/ContentManager/R6")
public class ICoreServiceConvertXmlToSearchQueryCoreServiceFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CoreServiceFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ICoreServiceConvertXmlToSearchQueryCoreServiceFaultFaultFaultMessage(String message, CoreServiceFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ICoreServiceConvertXmlToSearchQueryCoreServiceFaultFaultFaultMessage(String message, CoreServiceFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sdltridion.contentmanager.r6.CoreServiceFault
     */
    public CoreServiceFault getFaultInfo() {
        return faultInfo;
    }

}
