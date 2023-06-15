# Java polomorfismo

## Contructor

A modo de repaso, constructor es un método del mismo tipo de retorno de la clase y que puede aceptar parámetros o no para asignarlos a las variables.
e.g

```java
public class Funcionario {
    public Funcionario(){}
}
```

## Herencia

La herencia de clases se da a travez de la palabra reservada **extends**,

#### Facts:

- Buscar el comun denominador de las clases creadas
- La clase Hija hereda todos los metodos y atributos de su padre pero no sucede al revez

```java
public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSecion(String clave){
        return this.clave.equals(clave);
    }
}
```

La clase gerente tendra acceso a todos los metodos y atributos en la clase Funcionario, pero la clase Funcionario no tendra acceso a los metodos creados en la case hija _(gerente)_ e.i _setClave, iniciarSecion_.

_"Al heredar la clase hija gana todas las características (atributos) y todas las funcionalidades (métodos) de la clase madre."_

#### Super

Super es la palabra reservada diciéndonos: "Oye, quiero que de la clase padre, la clase que está arriba, de la clase superior,llama a este método de él".

```java
    public double getBonificacion(){
        return super.getSalario();
    }
```

**protected**: es visible para las demas clases en el mismo paquete, para la clase actual y para las cases hijas.

#### This y super

| This                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Super                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| La palabra clave `this` se refiere al objeto actual en un método o constructor. El uso más común de este término es eliminar la confusión entre los atributos de clase y los parámetros del mismo nombre (porque un atributo de clase está sombreado por un parámetro de método o constructor). Además de este uso, esta palabra se puede utilizar para: <ul><li>Invocar al constructor de la clase actual.</li><li>Invocar el método de clase actual.</li><li>Devolver el objeto de clase actual.</li><li>Pasar un argumento en la llamada al método.</li><li>Pasar un argumento en la llamada al constructor.</li></ul> | La palabra clave `super` se refiere a objetos de superclase (madre). Se utiliza para llamar a los métodos de la superclase y para acceder al constructor de la superclase. El uso más común de la palabra clave `super` es eliminar la confusión entre superclases y subclases que tienen métodos con el mismo nombre. <ul><li>`super`: utilizado para referirse a la variable de instancia de la clase inmediatamente superior (clase madre).</li><li>Se usa para invocar métodos de la clase inmediatamente superior (clase madre).</li><li>`super()`: se utiliza para invocar al constructor de la clase inmediatamente superior (clase madre).</li></ul> |

#### Sobre escritura de metodo

permite redefinir un comportamiento previsto en la clase madre a través de la clase hija.

La palabra llave con menor visibilidad es private, después viene protected y después public.

- private - solo visible dentro de la clase.

- protected - visible dentro de la clase y también para las hijas.

- public - visible en todo lugar.

_"También tenga en cuenta que protected está relacionado con la herencia."_

#### Modificadores de acceso

Los modificadores de acceso o accesibilidad son algunas palabras claves utilizadas en el lenguaje Java para definir el nivel de accesibilidad que los elementos de una clase (atributos y métodos) e incluso la propia clase puede tener los mismos elementos de otra clase.

**Public**

Este es el modificador menos restrictivo de todos. De esta manera, cualquier componente puede acceder a los miembros de la clase, las clases y las interfaces.

**Protected**

Al usar este modificador de acceso, los miembros de la clase y las clases son accesibles para otros elementos siempre que estén dentro del mismo package o, si pertenecen a otros packages, siempre que tengan una relación extendida (herencia), es decir, las clases secundarias pueden acceder a los miembros de su clase principal (o clase de abuelos, etc.).

**Private**

Este es el modificador de acceso más restrictivo de todos. Solo se puede acceder a los miembros definidos como privados desde dentro de la clase y desde ningún otro lugar, independientemente del paquete o la herencia.

Hagas clic [aquí](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) para acceder a la documentación oficial y obtener más información.

Existe otro concepto en los lenguajes OO que se llama sobrecarga que es mucho más simple que la sobreescritura y no depende de la herencia.

Por ejemplo, en nuestra clase Gerente, imagina otro nuevo método autenticar que recibe además de la contraseña también el login:

```java
public class Gerente extends Funcionario {

    private int contraseña;

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }

    // Nuevo método, recibiendo dos parámetros
    public boolean autenticar(String login, int contraseña) {
        // implementación omitida
    }

    // Otros métodos omitidos
}
```

Observe que hemos creado una nueva versión del método autenticar. Ahora tenemos dos métodos de autenticar en la misma clase que varían en el número o tipo de parámetros. Esto se llama sobrecarga de métodos.

La sobrecarga no tiene en cuenta la visibilidad o retorno del método, solo los parámetros y no depende de la herencia.

# Polimorfismo

Los dos pilares de la herencia son, La reutilizacion del codigo y el polimorfismo.

El elemento mas generico puede ser adaptado al elemento mas especifico.

_"Todos los funcionarios son gerentes mas no todos los gerentes son funcionarios"_

_i.e:_ En el mundo orientado a objetos, el polimorfismo permite que las referencias de tipos de clases más genéricos referencian objetos más específicos.

El polimorfismo nos ayuda en
Si temenos una clase **_ControlBonificacion_** nos bastara con usar el parametro mas generico en este caso _funcionario_ y que asi todas las demas clases puedan verse registradas

```java
public class ControlBonificacion {
    private double suma;

    public double registarSalario(Funcionario funcionario){

        this.suma += funcionario.getBonificacion();
        System.out.println("current Value: "+this.suma);
        return this.suma;
    }
}

```

---

```java
    Funcionario diego = new Funcionario();
    diego.setSalario(2000);

    Gerente jimena = new Gerente();
    jimena.setSalario(10000);

    ControlBonificacion controlBonificacion = new ControlBonificacion();
    controlBonificacion.registarSalario(diego);
    controlBonificacion.registarSalario(jimena);
```

El parametro que recibas asi jimena sea Gerente tambien es un Funcionario asi que podra ingresar a _registarSalario_ sin ningun problema.

**Siempre va a llamar el metodo de la clase mas especifica**

# Herencia y el uso de contructores

Para la herencia los hijos tambien deben tener las restricciones o reglas de negocio de la clase padre.

```java
public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero);
    }
}
```

**_Super_**: Llama al constructor de la clase padre sea bien el que es por defecto o el que nosotros creamos e.g

```java
     public class Cuenta {

    private double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;
//Contructor ↓
    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("numero actula de cuentas: "+total);

        Cuenta.total++;

    }
}
```

_Esto se realiza para mantener la integrdad de nuestras reglas de negocio_

### Sobre escritura de metodos

_@Override_: Inidica que el metodo va a ser sobre escrito de la clase padre y que no es un metodo nuevo.

### polimorfismo

Una cuenta se volvió cuenta corriente y la cuenta corriente puede implementar su propia lógica de negocio basada en su clase cuenta, en su clase padre, sobreescribiendo datos importantes sobre la escritura de métodos. La firma del método, → _"public boolean saca(double valor)"_ **nombre, tipo de método, parámetros, tienen que ser exactamente iguales**.

si no son iguales seria un metodo nuevo

```java
    @Override
    public boolean saca(double valor) { //Es el mismo que esta en la clase padre
        double comision = 0.2;

        return super.saca(valor + comision);
    }
```

**No borrar** _@Override_

Si se borra este método no va a sobreescribir el método del padre, este método va a ser considerado un método nuevo de esta clase y no es siempre lo que nosotros queremos.

la anotación override. Tiene que estar aquí. Esto me asegura, me confirma siempre que este método lo estoy sobreescribiendo y que no estoy cometiendo ningún error.

# Clases y metodos abstractos

### clase abstracta

```java
public abstract class Funcionario {
     Funcionario diego = new Funcionario();
}
```

_abstract_: Es un representacion conceptual pero no puede ser una representacion fisica del objeto _i.e_ Funcionario son todos en el caso _"Funcionario diego = new Funcionario()"_ todos son funcionarios no solo Diego por ello aqui que darle un cargo a diego como lo seria:

```java
    public static void main(String[] args) {
        Funcionario diego = new Contador();
    }
```

Asi diego no tendria acceso a algo general si no se sabria que es diego que para el ejemplo diego es un contador.

### Metodo abstracto

Si el metodo no requiere una implementacion

```java
    public abstract double getBonificacion();
```

Este metodo obliga a las clases hijas a sobre escribirlo y hace que en el metodo abstracto no se tenga que poner ninguna funcionalidad.

Los métodos abstractos nunca pueden tener un cuerpo
Tan pronto como ponemos un método abstracto, la clase también debe ser abstracta.

Solo no se vera obligado a sobre escribir si el metodo hijo es tambien abstracto.

**Protected**: Nos permite acceder a los atributos del padre desde el hijo.

##### Clase Abstracta e Interfaz

![Alt text](image-1.png)

- Las clases abstractas son útiles cuando queremos utilizar comportamientos y atributos basados ​​en clases con comportamientos comunes.
- Usamos métodos abstractos cuando queremos "forzar" a un hijo concreto (clase concreta) a implementar un método.

##### clases abstractas

- No se puede crear una instancia
- Puede tener métodos abstractos (sin implementación)
- Pueden tener atributos
- Puede tener métodos concretos (con implementación)

# Interfaces

_Se utilizan para los casos en los que es necesario realizar herencia multiple._

En Java no se permite la herencia multiple, como si lo hace en C#.

Las interfaces no pueden tener metodos inplementados, metodos con cuerpo

#### Clases abstractas x interfaces

- Podemos extender solo una clase abstracta, pero podemos implementar varias interfaces. _(Solo existe una herencia simple en Java, pero podemos implementar tantas interfaces como queramos.)_
- Todos los métodos de una interfaz son abstractos, los de una clase abstracta pueden no serlo. _(todos los métodos en la interfaz son siempre abstractos y siempre públicos.En una clase abstracta podemos tener métodos concretos y abstractos.)_
- No se pueden instanciar, ninguno se puede implementar. ¡No podemos dar new en la clase abstracta, ni en la interfaz!
- Un interface **NO** puede extrender de una clase.
- La interface **NO** extiende _extends_ si no implementa _implements_

En mis palabras

La interfas implementa metodos a las clases que hayan sido marcadas con implemets, es como una etiqueta, inicamete tendra la firma y la implementacion quedara a merced del metodo que la implemente, esta no tiene una jeraquia

Las cases tienen jerarquia
y las interfases son caracteristicas

**Herencia múltiple**: En Java, una clase puede implementar múltiples interfaces, lo que permite una forma de herencia múltiple. Cada una de estas interfaces puede declarar métodos y constantes, y la clase debe proporcionar implementaciones para los métodos declarados en todas las interfaces que implementa.

**Diferencias con las clases abstractas**: A diferencia de las interfaces, una clase solo puede extender una única clase abstracta, lo que significa que Java no permite la herencia múltiple de clases. Además, mientras que las interfaces solo pueden declarar métodos y constantes, las clases abstractas pueden declarar tanto métodos como variables de instancia, y pueden proporcionar implementaciones parciales o completas de métodos. Las clases abstractas también pueden tener constructores, mientras que las interfaces no pueden.

---

**Usa una interfaz cuando:**

Quieres definir un contrato para lo que una clase puede hacer, sin preocuparte por cómo lo hace. Las interfaces son útiles cuando quieres asegurarte de que una clase cumple con un cierto contrato, pero no te importa cómo se implementa ese contrato.

Necesitas soportar la herencia múltiple. En Java, una clase puede implementar múltiples interfaces.

Quieres cambiar la funcionalidad de tu clase sin cambiar la clase en sí. Puedes hacer esto implementando una nueva interfaz.

**Usa una clase abstracta cuando:**

Quieres proporcionar comportamiento compartido que se puede utilizar en varias clases relacionadas.

Tienes una jerarquía de clases y quieres proporcionar implementaciones predeterminadas de métodos que pueden ser heredados o sobrescritos por subclases.

Quieres controlar el diseño de una parte de tu sistema y evitar que se desvíe demasiado. Las clases abstractas permiten proporcionar más estructura, lo que puede ser útil en sistemas grandes y complejos.

---

Las interfaces en Java son fundamentales para el concepto de programación orientada a objetos. Son una forma de definir un contrato de comportamiento que las clases pueden implementar. Aquí te dejo algunos detalles adicionales sobre las interfaces:

**Definición**: Una interfaz se define con la palabra clave interface. Puede contener métodos y constantes, pero no puede contener variables de instancia.

**Métodos**: Todos los métodos en una interfaz son implícitamente públicos y abstractos. Esto significa que no tienen un cuerpo y deben ser implementados por cualquier clase que implemente la interfaz. A partir de Java 8, las interfaces pueden contener métodos por defecto y métodos estáticos con un cuerpo.

**Constantes**: Todas las variables definidas en una interfaz son implícitamente public, static y final. Es decir, son constantes.

**Implementación**: Una clase implementa una interfaz utilizando la palabra clave implements. Si una clase implementa una interfaz, debe proporcionar implementaciones para todos sus métodos (a menos que la clase sea abstracta).

**Herencia múltiple**: A diferencia de las clases, las interfaces permiten la herencia múltiple. Una clase puede implementar múltiples interfaces, y una interfaz puede extender múltiples interfaces.

**Polimorfismo**: Las interfaces son una forma de lograr el polimorfismo en Java. Puedes utilizar una interfaz como el tipo de una variable, y luego asignar a esa variable cualquier objeto que implemente la interfaz.

Aquí tienes un ejemplo de una interfaz y una clase que implementa esa interfaz:

```java
interface Volador {
void volar();
}

class Pajaro implements Volador {
public void volar() {
System.out.println("El pájaro está volando");
}
}
```

En este ejemplo, **Volador** es una interfaz que declara un método _volar_. Luego, la clase _Pajaro_ implementa esta interfaz y proporciona una implementación para el método _volar_.

# Composicion de objetos
