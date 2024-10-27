#language: es

Característica: Flujo de compra E2E en Opencart abstracta


  Antecedentes:
    Dado el usuario abra el navegador en la pagina principal de  Opencart abstracta


  Escenario: Realizar compra de dos  productos y poderlos visualizar y completar la compra como invitado
    Cuando el usuario agrega el primer producto al carrito
    Y el usuario agrega el segundo producto al carrito
    Y el usuario visualiza el carrito
    Entonces el carrito debe contener los productos Producto 1 y Producto 2
    Y el usuario selecciona Checkout
    Y el usuario selecciona Guest Checkout
    Y el usuario completa los formularios
    Y el usuario confirma la orden
    Entonces el mensaje Your order has been placed! debe aparecer en la página de confirmación