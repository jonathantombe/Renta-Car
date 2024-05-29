import java.util.*;

public class Main {
    private static List<Garaje> garajes = new ArrayList<>();
    private static List<Agencia> agencias = new ArrayList<>();
    private static List<Automovil> automoviles = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args) {
        garajes.add(new Garaje(1, "Calle Falsa 123", 50));
        garajes.add(new Garaje(2, "Avenida Siempre Viva 742", 30));
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. CRUD Agencias");
            System.out.println("2. CRUD Automóviles");
            System.out.println("3. CRUD Clientes");
            System.out.println("4. CRUD Reservas");
            System.out.println("5. Listar alquileres de un cliente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    crudAgencias(scanner);
                    break;
                case 2:
                    crudAutomoviles(scanner);
                    break;
                case 3:
                    crudClientes(scanner);
                    break;
                case 4:
                    crudReservas(scanner);
                    break;
                case 5:
                    listarAlquileresDeCliente(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void crudAgencias(Scanner scanner) {
        int option;
        do {
            System.out.println("\nCRUD Agencias:");
            System.out.println("1. Agregar Agencia");
            System.out.println("2. Eliminar Agencia");
            System.out.println("3. Listar Agencias");
            System.out.println("4. Actualizar Agencia");
            System.out.println("5. Consultar agencia");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese ID de la Agencia: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Nombre de la Agencia: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Dirección de la Agencia: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese Teléfono de la Agencia: ");
                    String telefono = scanner.nextLine();
                    agencias.add(new Agencia(id, nombre, direccion, telefono));
                    System.out.println("Agencia agregada.");
                    break;
                case 2:
                    System.out.print("Ingrese ID de la Agencia a eliminar: ");
                    id = scanner.nextInt();
                    agencias.removeIf(agencia -> agencia.getId() == id);
                    System.out.println("Agencia eliminada.");
                    break;
                case 3:
                    System.out.println("Lista de Agencias:");
                    for (Agencia agencia : agencias) {
                        System.out.println(agencia);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese ID de la Agencia a actualizar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    Agencia agencia = agencias.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
                    if (agencia != null) {
                        System.out.print("Ingrese nuevo Nombre de la Agencia: ");
                        nombre = scanner.nextLine();
                        System.out.print("Ingrese nueva Dirección de la Agencia: ");
                        direccion = scanner.nextLine();
                        System.out.print("Ingrese nuevo Teléfono de la Agencia: ");
                        telefono = scanner.nextLine();
                        agencia.setNombre(nombre);
                        agencia.setDireccion(direccion);
                        agencia.setTelefono(telefono);
                        System.out.println("Agencia actualizada.");
                    } else {
                        System.out.println("Agencia no encontrada.");
                    }

                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 0);
    }

    private static void crudAutomoviles(Scanner scanner) {
        int option;
        do {
            System.out.println("\nCRUD Automóviles:");
            System.out.println("1. Agregar Automóvil");
            System.out.println("2. Eliminar Automóvil");
            System.out.println("3. Listar Automóviles");
            System.out.println("4. Actualizar Automóvil");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese ID del Automóvil: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Matrícula del Automóvil: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese Modelo del Automóvil: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese Color del Automóvil: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese Marca del Automóvil: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese ID del Garaje: ");
                    int garajeId = scanner.nextInt();
                    scanner.nextLine();
                    Garaje garaje = buscarGarajePorId(garajeId); // Buscar garaje existente por ID
                    if (garaje != null) {
                        automoviles.add(new Automovil(id, matricula, modelo, color, marca, garaje));
                        System.out.println("Automóvil agregado.");
                    } else {
                        System.out.println("Garaje no encontrado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese ID del Automóvil a eliminar: ");
                    id = scanner.nextInt();
                    automoviles.removeIf(automovil -> automovil.getId() == id);
                    System.out.println("Automóvil eliminado.");
                    break;
                case 3:
                    System.out.println("Lista de Automóviles:");
                    for (Automovil automovil : automoviles) {
                        System.out.println(automovil);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese ID del Automóvil a actualizar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    Automovil automovil = automoviles.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
                    if (automovil != null) {
                        System.out.print("Ingrese nueva Matrícula del Automóvil: ");
                        String nuevaMatricula = scanner.nextLine();
                        System.out.print("Ingrese nuevo Modelo del Automóvil: ");
                        String nuevoModelo = scanner.nextLine();
                        System.out.print("Ingrese nuevo Color del Automóvil: ");
                        String nuevoColor = scanner.nextLine();
                        System.out.print("Ingrese nueva Marca del Automóvil: ");
                        String nuevaMarca = scanner.nextLine();
                        System.out.print("Ingrese nuevo ID del Garaje: ");
                        garajeId = scanner.nextInt();
                        scanner.nextLine();
                        Garaje nuevoGaraje = buscarGarajePorId(garajeId); // Buscar garaje existente por ID
                        if (nuevoGaraje != null) {
                            automovil.setMatricula(nuevaMatricula);
                            automovil.setModelo(nuevoModelo);
                            automovil.setColor(nuevoColor);
                            automovil.setMarca(nuevaMarca);
                            automovil.setGaraje(nuevoGaraje);
                            System.out.println("Automóvil actualizado.");
                        } else {
                            System.out.println("Garaje no encontrado.");
                        }
                    } else {
                        System.out.println("Automóvil no encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 0);
    }

    private static Garaje buscarGarajePorId(int id) {
        return garajes.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
    }


    private static void crudClientes(Scanner scanner) {
        int option;
        do {
            System.out.println("\nCRUD Clientes:");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Eliminar Cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Actualizar Cliente");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese Código del Cliente: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();  // Consumir newline
                    System.out.print("Ingrese DNI del Cliente: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese Nombre del Cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Dirección del Cliente: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese Teléfono del Cliente: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese Código del Cliente Avalado por: ");
                    int avaladoPorCodigo = scanner.nextInt();
                    scanner.nextLine(); // Consumir newline

                    Cliente avaladoPor = null;
                    if (avaladoPorCodigo != 0) {
                        avaladoPor = clientes.stream().filter(c -> c.getCodigo() == avaladoPorCodigo).findFirst().orElse(null);
                        if (avaladoPor == null) {
                            System.out.println("Cliente Avalado por no encontrado. El cliente no será avalado por nadie.");
                        }
                    }

                    clientes.add(new Cliente(codigo, dni, nombre, direccion, telefono, avaladoPor));
                    System.out.println("Cliente agregado.");
                    break;
                case 2:
                    System.out.print("Ingrese Código del Cliente a eliminar: ");
                    codigo = scanner.nextInt();
                    clientes.removeIf(cliente -> cliente.getCodigo() == codigo);
                    System.out.println("Cliente eliminado.");
                    break;
                case 3:
                    System.out.println("Lista de Clientes:");
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese Código del Cliente a actualizar: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    Cliente cliente = clientes.stream().filter(c -> c.getCodigo() == codigo).findFirst().orElse(null);
                    if (cliente != null) {
                        System.out.print("Ingrese nuevo DNI del Cliente: ");
                        String nuevoDni = scanner.nextLine();
                        System.out.print("Ingrese nuevo Nombre del Cliente: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Ingrese nueva Dirección del Cliente: ");
                        String nuevaDireccion = scanner.nextLine();
                        System.out.print("Ingrese nuevo Teléfono del Cliente: ");
                        String nuevoTelefono = scanner.nextLine();
                        cliente.setDni(nuevoDni);
                        cliente.setNombre(nuevoNombre);
                        cliente.setDireccion(nuevaDireccion);
                        cliente.setTelefono(nuevoTelefono);
                        System.out.println("Cliente actualizado.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 0);
    }

    private static void crudReservas(Scanner scanner) {
        int option;
        do {
            System.out.println("\nCRUD Reservas:");
            System.out.println("1. Agregar Reserva");
            System.out.println("2. Eliminar Reserva");
            System.out.println("3. Listar Reservas");
            System.out.println("4. Actualizar Reserva");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese ID de la Reserva: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese Código del Cliente: ");
                    int clienteCodigo = scanner.nextInt();
                    Cliente cliente = clientes.stream().filter(c -> c.getCodigo() == clienteCodigo).findFirst().orElse(null);
                    System.out.print("Ingrese ID de la Agencia: ");
                    int agenciaId = scanner.nextInt();
                    Agencia agencia = agencias.stream().filter(a -> a.getId() == agenciaId).findFirst().orElse(null);
                    Date fechaInicio = new Date();
                    Date fechaFin = new Date();
                    System.out.print("Ingrese Precio Total: ");
                    float precioTotal = scanner.nextFloat();
                    boolean entregado = false;

                    Reserva nuevaReserva = new Reserva(id, fechaInicio, fechaFin, precioTotal, entregado, cliente, agencia);
                    reservas.add(nuevaReserva);
                    if (cliente != null) cliente.realizar(nuevaReserva);
                    if (agencia != null) agencia.getReservas().add(nuevaReserva);
                    System.out.println("Reserva agregada.");
                    break;
                case 2:
                    System.out.print("Ingrese ID de la Reserva a eliminar: ");
                    id = scanner.nextInt();
                    reservas.removeIf(reserva -> reserva.getId() == id);
                    System.out.println("Reserva eliminada.");
                    break;
                case 3:
                    System.out.println("Lista de Reservas:");
                    for (Reserva res : reservas) {
                        System.out.println(res);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese ID de la Reserva a actualizar: ");
                    id = scanner.nextInt();
                    Reserva reservaActualizar = reservas.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
                    if (reservaActualizar != null) {
                        System.out.print("Ingrese nuevo Precio Total: ");
                        float nuevoPrecioTotal = scanner.nextFloat();
                        reservaActualizar.setPrecioTotal(nuevoPrecioTotal);
                        System.out.println("Reserva actualizada.");
                    } else {
                        System.out.println("Reserva no encontrada.");
                    }
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 0);
    }

    private static void listarAlquileresDeCliente(Scanner scanner) {
        System.out.print("Ingrese Código del Cliente: ");
        int codigo = scanner.nextInt();
        Cliente cliente = clientes.stream().filter(c -> c.getCodigo() == codigo).findFirst().orElse(null);
        if (cliente != null) {
            cliente.listar();
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
