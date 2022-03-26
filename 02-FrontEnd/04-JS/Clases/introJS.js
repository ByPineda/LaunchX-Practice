console.log("\n***************************VARIABLES NUMERICAS");
var numero1 = 10;
var numero2 = 2;



console.log("Numero 1: "+numero1 +"Numero 2:" +numero2);
console.log("\n***************************VARIABLES CADENAS");
var frase1 = "Ejemplo de comillas dobles";
var frase2 = 'Ejemplo de comillas simples';
var frase3 = `Ejemplo de comillas invertidas`;

console.log(frase1);
console.log(frase2);
console.log(frase3);

console.log("\n***************************CONDICIONALES");
console.log(numero1 === numero2);
//VAR SE USA PARA VARIABLES GLOBALES
//LET SE USA PARA BLOQUES DE CÓDIGO, SON MÁS ESPECIFICOS VAYA (como buena práctica)
let listaDeNumeros1 = [2,3,4,5,6,7,8,9,10,11];

console.log(listaDeNumeros1);
console.log(listaDeNumeros1.length);

listaDeNumeros1.push(33);
listaDeNumeros1.push(939);

console.log(listaDeNumeros1);
console.log(listaDeNumeros1.length);

console.log("\n***************************OBJETOS");

let Explorer = {
    nombre: "ANGEL",
    email:  "explorer@inovaccionvirtual.com",
    numReg: 123456 ,
    mission: "Frontend",
    proyectos: ["Abogabot","Taqueria","Pasteleria","Vacunas"]

}
//El objeto se guarda como JSON: JavaScrip Object Notation.

console.log(Explorer);
console.log(Explorer.email);
/*
    NOTA: EL ";" NO ES NECESARIO PERO SI ES BUENA PRÁCTICA UTILIZARLO
    NOTA: EN JS NO SE TIENEN QUE DECLARAR EL TIPO DE VARIABLES, SIMPLEMENTE SE LE ASIGNA EL TIPO Y JS LO CREA AUTOMATICAMENTE
    FUN FACT: JAVASCRIPT NO TIENE QUE VER CON JAVA, ES ECMASCRIPT EN REALIDAD. SOLO SE COLGÓ DE LA FAMA DE JAVA.

    1) "=="   Es una igualdad relajada: esto significa que convierte los valores ingresados en un tipo comun y los compara.
            EJEMPLO: ("1" == 1) OUT: TRUE
    2) "==="   Es una igualdad estricta, esto significa que ls valores comparados deben de ser el mismo tipo y valor. 
            EJEMPLO: (1 === 1)      OUT:  TRUE
                     ("1" === 1)    OUT:  FALSE 


    Los demás operadores lógicos son los de siempre en todos los lenguajes:
    -OR (||), AND(&&), N.E (!=), MAYORES Y MENORES (>,<, >=, <=), et cetera....
*/

/* FLUJOS CONDICIONALES

    -The conditional statements in JS are very similar to Java statements, there isn't mucho difference, meh.
    -The "switch" statement is the same shit for JS, JAVA, C.


*/

console.log("\n***************************OBJETOS");
if(numero2 > numero1){
    console.log("El valor: "+ numero2+" es mayor que el valor :"+numero1);
}
else{
    console.log("El valor: "+ numero2+" es menor que el valor : "+numero1);
}

//EXCEPCIONES
/*
Exception handling is a great practice because if your code happens to have an exceotion it would break everyting and stop executing so... it IS important hahha

*/
function promtDirection(pregunta) {
    let result = prompt(pregunta);
    if(result.toLowerCase() == "left") return "L";
    if(result.toLowerCase() == "right") return "R";
    throw new Error("Invalid Direction: "+result);
}

function mirar(){
    if(promtDirection("Which way?")== "L" ){
        return "a house";
    }
    else{
        return "two angry bears";
    }
}

try {
    console.log("You see", mirar());
}
catch(error){
    console.log("Something went wrong: "+error);
}

