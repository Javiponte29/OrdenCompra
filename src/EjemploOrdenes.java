import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Juan", "Perez");
        Cliente cliente2 = new Cliente("Maria", "Gomez");
        Cliente cliente3 = new Cliente("Luis", "Ramirez");

        Producto producto1 = new Producto("Apple", "iPhone", 1200);
        Producto producto2 = new Producto("Samsung", "Galaxy", 1000);
        Producto producto3 = new Producto("Sony", "PlayStation", 500);
        Producto producto4 = new Producto("LG", "Televisor", 700);
        Producto producto5 = new Producto("Dell", "Laptop", 1500);
        Producto producto6 = new Producto("HP", "Impresora", 300);
        Producto producto7 = new Producto("Microsoft", "Xbox", 400);
        Producto producto8 = new Producto("Nintendo", "Switch", 350);

        OrdenCompra orden1 = new OrdenCompra("Primera Orden");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        OrdenCompra orden2 = new OrdenCompra("Segunda Orden");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        OrdenCompra orden3 = new OrdenCompra("Tercera Orden");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto1);
        orden3.addProducto(producto5);
        orden3.addProducto(producto3);
        orden3.addProducto(producto7);

        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    private static void imprimirOrden(OrdenCompra orden) {
        System.out.println("Orden: " + orden.getDescripcion());
        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Productos:");
        for (Producto producto : orden.getProductos()) {
            if (producto != null) {
                System.out.println("- " + producto.getFabricante() + " " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }
        System.out.println("Gran Total: " + orden.calcularGranTotal());
    }
}

