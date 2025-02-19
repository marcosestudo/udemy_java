package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// Construtor padr�o
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Sobrecarga: podemos criar mais de um m�todo com o mesmo nome, com par�metros
	// diferentes
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// por padr�o, int � iniciado com 0, tornando desnecess�ria a atribui��o abaixo
		// deixei aqui s� pra ficar registrado
		quantity = 0;
	}

	// getters e setters
	// getters e setters, por conven��o v�m depois dos construtores
	// podem ser gerados automaticamente clicando com o 
	// bot�o direito > source > generate getters and setters
	// dessa forma tambpem podemos gerar construtores
	// bot�o direito > source > generate constructors using fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
