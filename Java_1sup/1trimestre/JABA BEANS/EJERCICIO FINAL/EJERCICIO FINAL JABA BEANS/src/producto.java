public class producto {
        String nombre,tipo;
        int stock,id, precio;
        public producto(String nombre, String tipo, int id, int stock, int precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.tipo = tipo;
        this.id = id;
        this.precio = precio;

    }

        public int getId() {
          return id;
        }
        public void setId(int id) {
                this.id = id;
        }
        public int getStock() {
            return stock;
        }
        public void setStock(int stock) {
            this.stock = stock;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


}



