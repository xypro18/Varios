/**
 * LojaBeanService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.loja.ejbs;

public interface LojaBeanService extends javax.xml.rpc.Service {
    public java.lang.String getLojaBeanPortAddress();

    public pt.loja.ejbs.LojaBean getLojaBeanPort() throws javax.xml.rpc.ServiceException;

    public pt.loja.ejbs.LojaBean getLojaBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
