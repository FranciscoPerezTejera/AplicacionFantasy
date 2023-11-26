package com.example.aplicacionfantasy.clases

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.aplicacionfantasy.R

@Composable
fun ListaDePokemons(): List<Pokemon> {

    var pokemones = listOf<Pokemon>(
    Pokemon("Pikachu","025","Electric","35","55","40","90", painterResource(id = R.drawable.p025),
        "Descripción:\n" +
                "Pikachu es un Pokémon pequeño y amarillo, conocido por sus mejillas rojas y sus orejas puntiagudas con puntas negras. Tiene grandes ojos marrones y una pequeña boca. Su cola es en forma de rayo y siempre está en posición vertical.\n" +
                "\n" +
                "Características:\n" +
                "Pikachu es conocido por su capacidad eléctrica. Puede generar y almacenar electricidad en sus mejillas, y la libera en forma de ataques eléctricos, como \"Impactrueno\". Es un Pokémon amigable y carismático, y su imagen ha llegado a ser el símbolo no oficial de la franquicia Pokémon.\n" +
                "\n" +
                "Apariciones en los Juegos:\n" +
                "Pikachu es un Pokémon muy destacado en los juegos de la serie principal de Pokémon y ha aparecido en casi todos los juegos desde el lanzamiento inicial de Pokémon. Además, es el compañero principal del personaje principal en muchos juegos, incluidos los populares \"Pokémon Yellow\", \"Pokémon: Let's Go, Pikachu!\" y \"Pokémon: Let's Go, Eevee!\"\n" +
                "\n" +
                "En el Anime:\n" +
                "Pikachu es el compañero principal del personaje principal, Ash Ketchum, en la serie de anime Pokémon. Su relación con Ash y su valentía en la serie han contribuido significativamente a su popularidad.\n" +
                "\n" +
                "En la Cultura Popular:\n" +
                "Pikachu se ha convertido en un ícono cultural y es reconocido incluso por aquellos que no están familiarizados con la serie Pokémon. Su imagen se utiliza en una variedad de productos y es conocido por su participación en eventos promocionales."),
    Pokemon("Venusaur","003","Grass/Poison","80","82","83","80",painterResource(id = R.drawable.p003),
        "Descripción:\n" +
                "Venusaur es un Pokémon grande y cuadrúpedo con características de dinosaurio. Tiene un cuerpo grueso, con un color verde predominante. En su espalda, Venusaur lleva una planta floreciente que ha crecido completamente desde la semilla en la espalda de Bulbasaur. Esta flor ha florecido completamente y emana un aroma fuerte cuando está lista para liberar poderosos ataques.\n" +
                "\n" +
                "Características:\n" +
                "\n" +
                "Flor en la Espalda: La flor en la espalda de Venusaur es el órgano donde almacena energía. A medida que la flor florece, aumenta su poder y vitalidad.\n" +
                "Ataques Específicos: Venusaur es conocido por su capacidad para aprender ataques de tipo Planta y Veneno. Algunos de sus movimientos característicos incluyen \"Látigo Cepa\", \"Rayo Solar\" y \"Bomba Lodo\".\n" +
                "Apariciones en los Juegos:\n" +
                "Venusaur es una evolución muy esperada en los juegos de la serie principal de Pokémon. Al evolucionar de Ivysaur, Venusaur obtiene estadísticas mejoradas y acceso a movimientos más poderosos.\n" +
                "\n" +
                "En el Anime:\n" +
                "Venusaur ha aparecido en varios episodios del anime Pokémon. Su participación destaca su fortaleza y la importancia de la relación entre los entrenadores y sus Pokémon evolucionados.\n" +
                "\n" +
                "En la Cultura Popular:\n" +
                "Venusaur es apreciado por su diseño distintivo y su papel como una evolución final fuerte en las estrategias de batalla de los entrenadores en los juegos."),
    Pokemon("Charizard","006","Fire/Fliying","78","84","78","100",painterResource(id = R.drawable.p006),
        "Descripción Pokédex:\n" +
                "Charizard, un Pokémon de tipo Fuego/Volador, es la forma final de la evolución de Charmander. Es conocido por su aliento de fuego extremadamente caliente, capaz de derretir incluso las rocas. Además de sus habilidades de tipo Fuego, Charizard también tiene la capacidad de volar, lo que lo convierte en un Pokémon impresionante en batallas.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Charizard es un Pokémon icónico y ha aparecido en muchos juegos de la serie principal de Pokémon. Además, es uno de los Pokémon iniciales que los entrenadores pueden elegir en varias regiones.\n" +
                "\n" +
                "Anime:\n" +
                "Charizard también es destacado en el anime de Pokémon, siendo uno de los Pokémon más poderosos y reconocibles de Ash Ketchum."),
    Pokemon("Blastoise","009","Water","79","83","100","78",painterResource(id = R.drawable.p009),
        "Descripción Pokédex:\n" +
                "Blastoise es la forma final de la evolución de Squirtle y Wartortle. Este Pokémon acuático se caracteriza por su caparazón robusto y potentes cañones de agua en lugar de las anteriores alas. Los cañones de agua en su espalda son tan poderosos que pueden disparar chorros de agua con una fuerza suficiente para perforar acero.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Blastoise es un Pokémon muy querido y ha aparecido en varios juegos de la serie principal de Pokémon. Es conocido por ser una opción poderosa en batallas acuáticas debido a su tipo Agua y las habilidades que adquiere al evolucionar.\n" +
                "\n" +
                "Anime:\n" +
                "Blastoise también ha sido destacado en el anime de Pokémon, siendo parte del equipo de varios entrenadores y participando en emocionantes batallas."),
    Pokemon("Pidgeot","018","Normal/Fliying","83","80","75","101",painterResource(id = R.drawable.p018),
        "Descripción Pokédex:\n" +
                "Pidgeot es conocido por su apariencia majestuosa y sus habilidades en vuelo. Su plumaje es de colores vivos, y sus alas son lo suficientemente fuertes como para llevar a un entrenador por los cielos. Es la forma evolucionada de Pidgeotto y Pidgey. Puede volar a grandes alturas y tiene una vista aguda que le permite detectar presas desde el aire.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Pidgeot es un Pokémon común en muchos juegos de la serie principal de Pokémon. Al evolucionar de Pidgeotto, obtiene mejoras significativas en sus estadísticas y se convierte en un Pokémon fuerte en batallas aéreas.\n" +
                "\n" +
                "Anime:\n" +
                "Pidgeot ha aparecido en el anime de Pokémon en manos de entrenadores destacados. En algunas regiones, es un Pokémon emblemático de los cielos y ha participado en diversas batallas."),
    Pokemon("Arcanine","059","Fire","90","110","80","95",painterResource(id = R.drawable.p059),
        "Descripción Pokédex:\n" +
                "Arcanine es conocido como el \"Pokémon legendario\" en algunas regiones. Su cuerpo está cubierto de pelaje naranja y tiene una melena larga y ondulada que le da un aspecto majestuoso. Aunque es de tipo Fuego, se le considera noble y leal. Puede correr a increíbles velocidades y es conocido por su agilidad.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Arcanine es una evolución de Growlithe, que es un Pokémon inicial en algunas regiones. A menudo, los entrenadores eligen a Growlithe como su compañero inicial y luego lo evolucionan a Arcanine. Arcanine tiene estadísticas de velocidad y ataque impresionantes, lo que lo convierte en un fuerte contendiente en batallas.\n" +
                "\n" +
                "Anime:\n" +
                "Arcanine ha aparecido en el anime de Pokémon en manos de entrenadores destacados. Su apariencia majestuosa y su naturaleza leal lo convierten en un Pokémon popular entre los personajes del anime."),
    Pokemon("Alakazam","065","Psychic","55","50","45","120",painterResource(id = R.drawable.p065),
        "Descripción Pokédex:\n" +
                "Alakazam es la evolución final de Abra, que a su vez evoluciona de Kadabra. Se caracteriza por su larga barba plateada y su postura erguida. Alakazam es conocido por su increíble coeficiente intelectual y sus poderes psíquicos. Se dice que posee un cerebro más desarrollado que el de un superordenador.\n" +
                "\n" +
                "Habilidades y Poderes:\n" +
                "Alakazam es famoso por su velocidad mental y por poder realizar cálculos extremadamente complejos en cuestión de segundos. Sus poderes telepáticos le permiten comunicarse con otros Pokémon y humanos sin necesidad de palabras. En batalla, utiliza ataques psíquicos poderosos y es ágil en el campo de juego.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Alakazam es un Pokémon muy valorado en los juegos de la serie principal debido a su fuerte estadística de ataque especial y velocidad. Para obtener un Alakazam, los entrenadores suelen evolucionar a Kadabra intercambiándolo con otro entrenador.\n" +
                "\n" +
                "Anime:\n" +
                "Alakazam ha aparecido en varios episodios del anime de Pokémon, mostrando sus habilidades psíquicas y participando en batallas emocionantes."),
    Pokemon("Machamp","068","Fighting","90","130","80","55",painterResource(id = R.drawable.p068),
        "Descripción Pokédex:\n" +
                "Machamp es la evolución final de Machop y Machoke. Es un Pokémon de aspecto fornido y musculoso con cuatro brazos poderosos. La energía que fluye por su cuerpo le otorga una fuerza física excepcional y una resistencia sobresaliente. Machamp es conocido por ser capaz de lanzar miles de puñetazos en un solo segundo.\n" +
                "\n" +
                "Habilidades y Poderes:\n" +
                "Machamp es un maestro en el combate cuerpo a cuerpo. Sus cuatro brazos le permiten ejecutar una variedad de movimientos y técnicas de lucha. Es particularmente hábil en el uso de golpes y agarres poderosos. En batalla, Machamp puede lanzar a su oponente con facilidad.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Machamp es un Pokémon popular en los juegos de la serie principal. Para obtener a Machamp, los entrenadores deben evolucionar a Machoke intercambiándolo. En algunos juegos, se ha introducido una forma Gigamax de Machamp, que le otorga un aumento de tamaño y poder temporal.\n" +
                "\n" +
                "Anime:\n" +
                "Machamp ha aparecido en varios episodios del anime de Pokémon, participando en torneos de lucha y demostrando su fuerza en diversas situaciones."),
    Pokemon("Gengar","094","Ghost/Poison","60","65","60","110",painterResource(id = R.drawable.p094),
        "Descripción Pokédex:\n" +
                "Gengar es la evolución final de Gastly y Haunter. Este Pokémon tiene una apariencia siniestra con grandes ojos rojos y una sonrisa maliciosa. Gengar se dice que se alimenta de las sombras de las personas y Pokémon. Puede camuflarse en la oscuridad y aparecer de repente para asustar a sus oponentes.\n" +
                "\n" +
                "Habilidades y Poderes:\n" +
                "Gengar es conocido por su velocidad y astucia en la batalla. Tiene acceso a una variedad de movimientos de tipo Fantasma y Veneno, lo que le permite enfrentarse a una amplia gama de oponentes. También se dice que puede hipnotizar a aquellos que miran fijamente sus ojos rojos.\n" +
                "\n" +
                "Megaevolución:\n" +
                "Gengar tiene una forma de Megaevolución llamada Mega Gengar. Durante la Megaevolución, su apariencia cambia, y obtiene un aumento significativo en velocidad y poder. Mega Gengar es conocido por su aspecto aún más aterrador y su destreza en combate.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Gengar es un Pokémon icónico que ha aparecido en todos los juegos principales de la serie Pokémon. Se puede obtener mediante la evolución de Haunter mediante intercambio. Además, Gengar es un Pokémon muy utilizado en batallas competitivas.\n" +
                "\n" +
                "Anime:\n" +
                "Gengar ha aparecido en varios episodios del anime de Pokémon, a menudo representado como un Pokémon astuto y juguetón."),
    Pokemon("Gyarados","130","Water/Fliying","95","125","79","81",painterResource(id = R.drawable.p030),
        "Descripción Pokédex:\n" +
                "Gyarados es famoso por su drástica transformación desde la aparentemente inofensiva forma de Magikarp. Magikarp, conocido por su debilidad extrema, evoluciona en Gyarados, un Pokémon gigantesco y feroz. Gyarados es temido por su naturaleza violenta y su capacidad para desatar furiosos ataques.\n" +
                "\n" +
                "Habilidades y Poderes:\n" +
                "Gyarados es un poderoso Pokémon de tipo Agua/Volador. Es conocido por su impresionante ataque y resistencia en combate. Puede aprender una variedad de movimientos de tipo Agua y Volador, lo que le otorga una amplia cobertura en batallas.\n" +
                "\n" +
                "Megaevolución:\n" +
                "Gyarados tiene una forma de Megaevolución llamada Mega Gyarados. Durante la Megaevolución, su apariencia se vuelve aún más imponente, y obtiene un aumento significativo en sus estadísticas de ataque y velocidad. Mega Gyarados es conocido por su furia devastadora en el campo de batalla.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Gyarados es un Pokémon icónico que ha aparecido en todos los juegos principales de la serie Pokémon. Se obtiene mediante la evolución de Magikarp a partir del nivel 20. Gyarados es a menudo utilizado como un Pokémon formidable en equipos de batalla.\n" +
                "\n" +
                "Anime:\n" +
                "Gyarados ha aparecido en varios episodios del anime de Pokémon, a menudo destacando su transformación impactante de Magikarp y su capacidad para causar destrucción con sus potentes ataques."),
    Pokemon("Snorlax","143","Normal","160","110","65","30",painterResource(id = R.drawable.p043),
        "Descripción Pokédex:\n" +
                "Snorlax es un Pokémon extremadamente grande y pesado que se encuentra a menudo durmiendo en medio del camino. Este Pokémon gigante es conocido por bloquear caminos y carreteras, lo que obliga a los entrenadores y viajeros a encontrar rutas alternativas. A pesar de su tamaño imponente, Snorlax es generalmente pacífico y disfruta de largas siestas.\n" +
                "\n" +
                "Habilidades y Poderes:\n" +
                "Snorlax es un Pokémon de tipo Normal con estadísticas de alto HP y defensa. Aunque suelen ser perezosos y tranquilos, son formidables en combate cuando se despiertan. Snorlax puede aprender una variedad de movimientos de tipo Normal y algunos movimientos de tipo Lucha.\n" +
                "\n" +
                "Apariciones en Videojuegos:\n" +
                "Snorlax ha aparecido en todos los juegos principales de la serie Pokémon. En muchos juegos, Snorlax bloquea el camino del jugador y debe ser despertado utilizando la flauta Poké Flute o algún otro método especial. Capturar o derrotar a Snorlax es a menudo un momento memorable en los juegos de Pokémon.\n" +
                "\n" +
                "Anime:\n" +
                "Snorlax ha tenido varias apariciones en el anime de Pokémon, a menudo mostrando su personalidad tranquila y su amor por dormir. También se destaca en el episodio en el que Ash captura a su propio Snorlax."))

    return pokemones
}