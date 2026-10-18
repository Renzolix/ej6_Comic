public class Comic {
    private String titulo;
    private double precio;
    private int stock;

    public Comic(String titulo, double precio, int stockInicial) {
        this.titulo = titulo;
        this.precio = (precio >= 0) ? precio : 0.0;
        this.stock = (stockInicial >= 0) ? stockInicial : 0;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setter únicamente para precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    // Métodos de negocio para alterar el stock
    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Se repusieron " + cantidad + " unidades. Stock actual: " + this.stock);
        } else {
            System.out.println("Error: La cantidad a reponer debe ser mayor a cero.");
        }
    }

    public void venderUnidad() {
        if (this.stock > 0) {
            this.stock--;
            System.out.println("Venta realizada. Unidades restantes de '" + titulo + "': " + this.stock);
        } else {
            System.out.println("Error: Sin stock disponible para vender '" + titulo + "'.");
        }
    }

    public static void main(String[] args) {
        Comic comic = new Comic("Spider-Man: Blue", 12500.0, 1);

        System.out.println("Comic: " + comic.getTitulo() + " | Stock inicial: " + comic.getStock());

        System.out.println("\nRealizando primera venta...");
        comic.venderUnidad();

        System.out.println("\nIntentando vender sin stock...");
        comic.venderUnidad();

        System.out.println("\nReponiendo stock...");
        comic.reponerStock(3);
        comic.venderUnidad();
    }
}