🧩 1. Introducción a Proyecto Pokecontrol(no terminado)
El sistema PokeControl busca ofrecer una solución para gestionar Pokémon capturados, consultarlos y realizar batallas entre ellos.

Es un ejercicio práctico y no está destinado a entorno de producción. Está orientado a mejorar el aprendizaje de la programación orientada a objetos.

🏗️ 2. Estructura General
El sistema está dividido en tres componentes principales:

Controlador Principal: Encargado de la lógica principal.

Clase Entrenador: Representa a cada usuario/jugador.

Clase Pokémon: Contiene las características y métodos de los Pokémon.

🧪 3. Funcionalidades
Registrar Pokémon

Mostrar Pokémon

Buscar por nombre

Realizar batalla entre dos Pokémon

Captura con nombre duplicado no permitida

Cantidad máxima de 6 Pokémon por entrenador

🧬 4. Clases Principales
Pokemon:

Atributos: nombre, tipo, nivel, salud.

Métodos: atacar, recibir daño, mostrar info.

Entrenador:

Atributos: nombre, lista de Pokémon.

Métodos: agregar Pokémon, mostrar Pokémon, buscar, iniciar batalla.

PokeControl (Controlador):

Maneja los menús y la interacción con el usuario.

Dirige las operaciones hacia las clases correspondientes.

🎮 5. Lógica de Batalla
Se eligen dos Pokémon.

Cada uno ataca al otro en turnos.

El primero que llegue a 0 de salud, pierde.

Se consideran tipos y niveles para calcular el daño.

💡 6. Observaciones Finales
Sistema ideal como ejercicio de refuerzo para POO.

Fomenta buenas prácticas como encapsulamiento, herencia (si se agregaran subtipos de Pokémon), y separación de responsabilidades.
