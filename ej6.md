# Ejercicio 6: Comic

## 🧠 Explicación Lógica
1. **Omisión de Setter Directo:** Se omitió a propósito el setter para `stock` con el fin de evitar modificaciones arbitrarias de inventario fuera de las reglas de negocio.
2. **Invariante de Negocio:** El método `venderUnidad()` protege el atributo evaluando `if (this.stock > 0)` antes de decrementar, asegurando que el stock nunca sea inferior a cero.
3. **Reposición Controlada:** `reponerStock()` incrementa las existencias solo si la cantidad recibida por parámetro es positiva.