package ListaLigada;

public class MainClient {

	public static void main(String[] args) {
		
		ListaLigada<Clientes> cliente = new ListaLigada<Clientes>();
		cliente.adicionar(new Clientes("123", "jão"));
		cliente.adicionar(new Clientes("345", "luci"));
		cliente.adicionar(new Clientes("987", "Ze"));
		
		System.out.println("tamanho: "+cliente.getTamanho());
		for (int i = 0; i < cliente.getTamanho(); i++) {
			System.out.println(cliente.get(i).getValor());
		}

	}

}
