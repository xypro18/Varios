/**
 * LojaBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.loja.ejbs;

public class LojaBeanServiceLocator extends org.apache.axis.client.Service implements pt.loja.ejbs.LojaBeanService {

    public LojaBeanServiceLocator() {
    }


    public LojaBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LojaBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LojaBeanPort
    private java.lang.String LojaBeanPort_address = "http://desktop-c4oss4c:8080/LojaBeanService/LojaBean";

    public java.lang.String getLojaBeanPortAddress() {
        return LojaBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LojaBeanPortWSDDServiceName = "LojaBeanPort";

    public java.lang.String getLojaBeanPortWSDDServiceName() {
        return LojaBeanPortWSDDServiceName;
    }

    public void setLojaBeanPortWSDDServiceName(java.lang.String name) {
        LojaBeanPortWSDDServiceName = name;
    }

    public pt.loja.ejbs.LojaBean getLojaBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LojaBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLojaBeanPort(endpoint);
    }

    public pt.loja.ejbs.LojaBean getLojaBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pt.loja.ejbs.LojaBeanPortBindingStub _stub = new pt.loja.ejbs.LojaBeanPortBindingStub(portAddress, this);
            _stub.setPortName(getLojaBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLojaBeanPortEndpointAddress(java.lang.String address) {
        LojaBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pt.loja.ejbs.LojaBean.class.isAssignableFrom(serviceEndpointInterface)) {
                pt.loja.ejbs.LojaBeanPortBindingStub _stub = new pt.loja.ejbs.LojaBeanPortBindingStub(new java.net.URL(LojaBeanPort_address), this);
                _stub.setPortName(getLojaBeanPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LojaBeanPort".equals(inputPortName)) {
            return getLojaBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ejbs.loja.pt/", "LojaBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ejbs.loja.pt/", "LojaBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LojaBeanPort".equals(portName)) {
            setLojaBeanPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
