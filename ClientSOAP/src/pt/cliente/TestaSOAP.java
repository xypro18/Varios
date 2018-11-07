package pt.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import pt.loja.ejbs.LojaBeanService;
import pt.loja.ejbs.LojaBeanServiceLocator;
import pt.loja.ejbs.Produto;

public class TestaSOAP {

	public static void main(String[] args) throws RemoteException, ServiceException, MalformedURLException {
		
		LojaBeanService lbs = new LojaBeanServiceLocator();
		Produto p = lbs.getLojaBeanPort(new URL("http://s06-formador:8080/LojaBeanService/LojaBean?wsdl")).getProduto(1);

		System.out.println(p.getNome());

	}

}
