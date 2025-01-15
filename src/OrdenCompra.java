import java.util.Date;

public class OrdenCompra {

    private static int contador = 0;
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    Producto[] productos;
    private int contadorProductos;

    public OrdenCompra(String descripcion) {
        this.id = ++contador;
        this.descripcion = descripcion;
        this.productos = new Producto[4]; // Arreglo de 4 elementos
        this.contadorProductos = 0;
    }

    {
        id = ++contador;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer calcularGranTotal() {
        int granTotal = 0;
        if (productos != null) {
            for (Producto producto : productos) {
                granTotal += producto.getPrecio();
            }
        }
        return granTotal;
    }

    public void addProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos, el límite es 4.");
        }
    }
}
