package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.Container;
import com.example.proyectoFinal1.model.ThrashType;
import com.example.proyectoFinal1.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContainerService {
    @Autowired
    private ContainerRepository repository;

    public List<Container> getAllContainers() {
        return repository.findAll();
    }

    public void getRecyclingIdeas(Long id){
        Optional<Container> container = repository.findById(id);
        ThrashType trash = container.get().getType();

        switch (trash) {
            case BATTERIES -> {
                System.out.println("# Punto de recogida de pilas\n" +
                        "Para poder reciclar pilas localiza un punto de recogida. Se trata de lugares donde " +
                        "se lleva a cabo una recogida de pilas para su posterior gestión y reciclaje. " +
                        "# Métodos para reciclar las pilas\n" +
                        "· Romper la pila en trozos pequeños en espacios cerrados y atmósferas controladas, " +
                        "lo que permite recuperar también los gases tóxicos que se liberan cuando se rompen.\n" +
                        "· Convertir la pila en ladrillos de desechos para construcciones amigables con el medio ambiente." +
                        "Esta solución no evitará que su contenido deje de ser contaminante, sino que aislará estos elementos tóxicos.\n" +
                        "· Calentar el contenido de la pila una vez troceada para, liberar los metales pesados en forma de vapor y, " +
                        "posteriormente, volver a solidificarlo para poder reusarlo." +
                        "# Otras opciones para evitar que las pilas contaminen el medio ambiente:\n" +
                        "\n" +
                        "Usar pilas recargables: antes que de botón, alcalinas y otros tipos.\n" +
                        "\n" +
                        "Optar por las energías renovables en tu hogar: compra aparatos que usen energías menos contaminantes " +
                        "o, energías limpias, como la energía solar.");
                break;
            }
            case GLASS -> {
                System.out.println("# Ideas para reciclar botellas de vidrio:\n" +
                        "· Usarlas como floreros de decoración, centros de mesa y en la cocina con plantas aromáticas.\n" +
                        "· Ponerlas en el baño, con palitos de sándalo que mantengan un olor fresco.\n" +
                        "· Como zapatero, colocándolas con tablas de madera u otro material.\n" +
                        "· Decorándolas con una fotografía a modo de etiqueta de la botella de vino y hacer un regalo de lo más original.\n" +
                        "· Como lámparas, con bombillas o luces pequeñas e, incluso, portavelas.\n");

                break;
            }
            case PAPER -> {
                System.out.println("# Papel reciclado en casa\n" +
                        "· Recolectar los papeles que normalmente se desechan a la basura. " +
                        "Tienen que estar limpios, por ejemplo sin restos de comida.\n" +
                        "· Cortarlos en pedazos de pequeño tamaño y ponerlos en remojo en un balde de agua durante una noche entera.\n" +
                        "· Colocar dos partes de agua por una de papel en una licuadora y licuar hasta obtener " +
                        "un producto con una textura de salsa.\n" +
                        "· Esparcir la mezcla sobre una malla de alambre" +
                        ", el grosor debe ser uniforme para que luego al secarse, quede parejo.\n" +
                        "· Pasar un rodillo sobre esta lámina para quitar el exceso de agua y despues una esponja seca, " +
                        "que te ayudará a absorberla.\n" +
                        "· Girar la malla de alambre hacia abajo, dejando caer el papel reciclado sobre cartón o periódico" +
                        " colocado sobre una superficie plana.\n" +
                        "· Por último, espera un día a que tu papel reciclado se seque por completo.");

                break;
            }
            case ORGANICS -> {
                System.out.println("# Fertilizante orgánico casero con fósforo: cenizas de madera\n" +
                        "· Para usar las cenizas de madera como fertilizante, solo hay que mezclarlas con agua, " +
                        "para diluir así su contenido, y lo aplicamos a las plantas como riego. " +
                        "Es importante hacerlo solo unas 2 o 3 veces al año para que no sea excesivo.\n" +
                        "\n" +

                        "# Fertilizante orgánico casero con potasio: cáscaras de banana\n" +
                        "· Disponer de varias cáscaras, que permitan llevar a cabo una buena extracción a partir de una infusión. " +
                        "Con 3 o 4 cáscaras de plátano para cada litro de agua nos bastará.\n" +
                        "· Trocea las cáscaras y ponelas, con agua, en una olla a hervir durante 15 minutos, aproximadamente.\n" +
                        "· Transcurrido este tiempo, cuela la mezcla y déjala enfriar.\n" +
                        "· Ya dispones de tu fertilizante, que mezclado con 2 litros de agua, ya estará listo para aplicar a tus plantas.\n" +

                        "# Fertilizante orgánico con calcio: cáscaras de huevo\n" +
                        "· Recopila un gran número de cáscaras de huevo.\n" +
                        "· Lávalas en caso de que aún contengan restos y triturarlas.\n" +
                        "· Pueden aplicarse directamente en tierra, aunque la absorción por parte de las plantas será más lenta.");
                break;
            }
            default -> throw new IllegalStateException("Can't recycle type of garbage" + trash);
        }
    }

}
