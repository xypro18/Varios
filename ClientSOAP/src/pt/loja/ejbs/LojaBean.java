/**
 * LojaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.loja.ejbs;

public interface LojaBean extends java.rmi.Remote {
    public pt.loja.ejbs.Produto getProduto(int produtoId) throws java.rmi.RemoteException;
    public pt.loja.ejbs.Produto getProdutoEspecial(int produtoId) throws java.rmi.RemoteException;
}
