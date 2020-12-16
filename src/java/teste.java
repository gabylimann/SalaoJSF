
import br.com.salao.dao.ClienteDAO;
import br.com.salao.dao.HibernateUtil;
import br.com.salao.vo.Cliente;

public class teste {
    public static void main (String [] args){
        Cliente c = new Cliente();
        c.setNome("Beatriz");
        c.setCelular(785857855);
        c.setCpf("78712558555525");
        c.setSenha("kikiki");
        c.setSituacao("Ta strickado");
        HibernateUtil.getSessionFactory().openSession().save(c);
        
        new ClienteDAO().salvar(c);
    }
}
