package pt.loja.ejbs;

public class LojaBeanProxy implements pt.loja.ejbs.LojaBean {
  private String _endpoint = null;
  private pt.loja.ejbs.LojaBean lojaBean = null;
  
  public LojaBeanProxy() {
    _initLojaBeanProxy();
  }
  
  public LojaBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initLojaBeanProxy();
  }
  
  private void _initLojaBeanProxy() {
    try {
      lojaBean = (new pt.loja.ejbs.LojaBeanServiceLocator()).getLojaBeanPort();
      if (lojaBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lojaBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lojaBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lojaBean != null)
      ((javax.xml.rpc.Stub)lojaBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pt.loja.ejbs.LojaBean getLojaBean() {
    if (lojaBean == null)
      _initLojaBeanProxy();
    return lojaBean;
  }
  
  public pt.loja.ejbs.Produto getProduto(int produtoId) throws java.rmi.RemoteException{
    if (lojaBean == null)
      _initLojaBeanProxy();
    return lojaBean.getProduto(produtoId);
  }
  
  public pt.loja.ejbs.Produto getProdutoEspecial(int produtoId) throws java.rmi.RemoteException{
    if (lojaBean == null)
      _initLojaBeanProxy();
    return lojaBean.getProdutoEspecial(produtoId);
  }
  
  
}